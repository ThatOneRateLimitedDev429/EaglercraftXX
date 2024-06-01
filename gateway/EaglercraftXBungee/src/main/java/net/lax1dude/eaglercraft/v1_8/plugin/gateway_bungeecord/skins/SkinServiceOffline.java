package net.lax1dude.eaglercraft.v1_8.plugin.gateway_bungeecord.skins;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

import net.lax1dude.eaglercraft.v1_8.plugin.gateway_bungeecord.server.EaglerInitialHandler;
import net.md_5.bungee.UserConnection;

/**
 * Copyright (c) 2022-2023 lax1dude. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class SkinServiceOffline implements ISkinService {

	public static final int masterRateLimitPerPlayer = 250;

	private static class CachedSkin {

		protected final UUID uuid;
		protected final byte[] packet;

		protected CachedSkin(UUID uuid, byte[] packet) {
			this.uuid = uuid;
			this.packet = packet;
		}

	}

	private final Map<UUID, CachedSkin> skinCache = new HashMap();

	private final Multimap<UUID, UUID> onlinePlayersFromTexturesMap = MultimapBuilder.hashKeys().hashSetValues().build();

	public void init(String uri, String driverClass, String driverPath, int keepObjectsDays, int keepProfilesDays,
			int maxObjects, int maxProfiles) {
		synchronized(skinCache) {
			skinCache.clear();
		}
	}

	public void processGetOtherSkin(UUID searchUUID, UserConnection sender) {
		if(((EaglerInitialHandler)sender.getPendingConnection()).skinLookupRateLimiter.rateLimit(masterRateLimitPerPlayer)) {
			CachedSkin cached;
			synchronized(skinCache) {
				cached = skinCache.get(searchUUID);
			}
			if(cached != null) {
				sender.sendData(SkinService.CHANNEL, cached.packet);
			}else {
				sender.sendData(SkinService.CHANNEL, SkinPackets.makePresetResponse(searchUUID));
			}
		}
	}

	public void processGetOtherSkin(UUID searchUUID, String skinURL, UserConnection sender) {
		Collection<UUID> uuids;
		synchronized(onlinePlayersFromTexturesMap) {
			uuids = onlinePlayersFromTexturesMap.get(searchUUID);
		}
		if(uuids.size() > 0) {
			CachedSkin cached;
			synchronized(skinCache) {
				Iterator<UUID> uuidItr = uuids.iterator();
				while(uuidItr.hasNext()) {
					cached = skinCache.get(uuidItr.next());
					if(cached != null) {
						sender.sendData(SkinService.CHANNEL, SkinPackets.rewriteUUID(searchUUID, cached.packet));
					}
				}
			}
		}
		sender.sendData(SkinService.CHANNEL, SkinPackets.makePresetResponse(searchUUID));
	}

	public void registerEaglercraftPlayer(UUID clientUUID, byte[] generatedPacket, int modelId) throws IOException {
		synchronized(skinCache) {
			skinCache.put(clientUUID, new CachedSkin(clientUUID, generatedPacket));
		}
	}

	public void unregisterPlayer(UUID clientUUID) {
		synchronized(skinCache) {
			skinCache.remove(clientUUID);
		}
	}

	public void registerTextureToPlayerAssociation(UUID textureUUID, UUID playerUUID) {
		synchronized(onlinePlayersFromTexturesMap) {
			onlinePlayersFromTexturesMap.put(textureUUID, playerUUID);
		}
	}

	public void flush() {
		// no
	}

	public void shutdown() {
		synchronized(skinCache) {
			skinCache.clear();
		}
	}

}
