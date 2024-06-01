package net.lax1dude.eaglercraft.v1_8.plugin.gateway_velocity.api.event;

import java.util.UUID;

import com.velocitypowered.api.util.GameProfile.Property;

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
public class EaglercraftRegisterSkinEvent {

	private final String username;
	private final UUID uuid;
	private Property useMojangProfileProperty = null;
	private boolean useLoginResultTextures = false;
	private byte[] customTex = null;
	private String customURL = null;

	public EaglercraftRegisterSkinEvent(String username, UUID uuid) {
		this.username = username;
		this.uuid = uuid;
	}

	public void setForceUseMojangProfileProperty(Property prop) {
		useMojangProfileProperty = prop;
		useLoginResultTextures = false;
		customTex = null;
		customURL = null;
	}

	public void setForceUseLoginResultObjectTextures(boolean b) {
		useMojangProfileProperty = null;
		useLoginResultTextures = b;
		customTex = null;
		customURL = null;
	}

	public void setForceUsePreset(int p) {
		useMojangProfileProperty = null;
		useLoginResultTextures = false;
		customTex = new byte[5];
		customTex[0] = (byte)1;
		customTex[1] = (byte)(p >> 24);
		customTex[2] = (byte)(p >> 16);
		customTex[3] = (byte)(p >> 8);
		customTex[4] = (byte)(p & 0xFF);
		customURL = null;
	}

	public void setForceUseCustom(int model, byte[] tex) {
		useMojangProfileProperty = null;
		useLoginResultTextures = false;
		customTex = new byte[2 + tex.length];
		customTex[0] = (byte)2;
		customTex[1] = (byte)model;
		System.arraycopy(tex, 0, customTex, 2, tex.length);
		customURL = null;
	}

	public void setForceUseCustomByPacket(byte[] packet) {
		useMojangProfileProperty = null;
		useLoginResultTextures = false;
		customTex = packet;
		customURL = null;
	}

	public void setForceUseURL(String url) {
		useMojangProfileProperty = null;
		useLoginResultTextures = false;
		customTex = null;
		customURL = url;
	}

	public String getUsername() {
		return username;
	}

	public UUID getUuid() {
		return uuid;
	}

	public Property getForceUseMojangProfileProperty() {
		return useMojangProfileProperty;
	}

	public boolean getForceUseLoginResultObjectTextures() {
		return useLoginResultTextures;
	}

	public byte[] getForceSetUseCustomPacket() {
		return customTex;
	}

	public String getForceSetUseURL() {
		return customURL;
	}

}
