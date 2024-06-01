package net.lax1dude.eaglercraft.v1_8.sp.relay.pkt;

/**
 * Copyright (c) 2022 lax1dude. All Rights Reserved.
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
public class ICEServerSet {

	public static enum RelayType {
		STUN, TURN;
	}

	public static class RelayServer {
		
		public final RelayType type;
		public final String address;
		public final String username;
		public final String password;
		
		protected RelayServer(RelayType type, String address, String username, String password) {
			this.type = type;
			this.address = address;
			this.username = username;
			this.password = password;
		}
		
		protected RelayServer(RelayType type, String address) {
			this.type = type;
			this.address = address;
			this.username = null;
			this.password = null;
		}

		public String getICEString() {
			if(username == null) {
				return address;
			}else {
				return address + ";" + username + ";" + password;
			}
		}
		
	}
	
}
