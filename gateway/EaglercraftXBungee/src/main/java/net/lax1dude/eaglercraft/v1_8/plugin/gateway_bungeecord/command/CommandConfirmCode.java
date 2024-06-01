package net.lax1dude.eaglercraft.v1_8.plugin.gateway_bungeecord.command;

import java.nio.charset.StandardCharsets;

import net.lax1dude.eaglercraft.v1_8.plugin.gateway_bungeecord.auth.SHA1Digest;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

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
public class CommandConfirmCode extends Command {

	public static String confirmHash = null;

	public CommandConfirmCode() {
		super("confirm-code", "eaglercraft.command.confirmcode", "confirmcode");
	}

	@Override
	public void execute(CommandSender var1, String[] var2) {
		if(var2.length != 1) {
			var1.sendMessage(new TextComponent(ChatColor.RED + "How to use: " + ChatColor.WHITE + "/confirm-code <code>"));
		}else {
			var1.sendMessage(new TextComponent(ChatColor.YELLOW + "Server list 2FA code has been set to: " + ChatColor.GREEN + var2[0]));
			var1.sendMessage(new TextComponent(ChatColor.YELLOW + "You can now return to the server list site and continue"));
			byte[] bts = var2[0].getBytes(StandardCharsets.US_ASCII);
			SHA1Digest dg = new SHA1Digest();
			dg.update(bts, 0, bts.length);
			byte[] f = new byte[20];
			dg.doFinal(f, 0);
			confirmHash = SHA1Digest.hash2string(f);
		}
	}

}
