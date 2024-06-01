package net.lax1dude.eaglercraft.v1_8.internal;

import net.lax1dude.eaglercraft.v1_8.update.UpdateCertificate;
import net.lax1dude.eaglercraft.v1_8.update.UpdateProgressStruct;

/**
 * Copyright (c) 2024 lax1dude. All Rights Reserved.
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
public class PlatformUpdateSvc {

	private static final UpdateProgressStruct dummyStruct = new UpdateProgressStruct();

	public static boolean supported() {
		return false;
	}

	public static void initialize() {
		
	}

	public static byte[] getClientSignatureData() {
		return null;
	}

	public static byte[] getClientBundleData() {
		return null;
	}

	public static void startClientUpdateFrom(UpdateCertificate clientUpdate) {
		
	}

	public static UpdateProgressStruct getUpdatingStatus() {
		return dummyStruct;
	}

	public static void quine(String filename, byte[] cert, byte[] data, String date) {
		
	}

	public static void quine(UpdateCertificate clientUpdate, byte[] data) {
		
	}
}
