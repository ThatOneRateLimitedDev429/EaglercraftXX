package net.lax1dude.eaglercraft.v1_8.internal;

import org.teavm.jso.webgl.WebGLBuffer;
import org.teavm.jso.webgl.WebGLFramebuffer;
import org.teavm.jso.webgl.WebGLProgram;
import org.teavm.jso.webgl.WebGLRenderbuffer;
import org.teavm.jso.webgl.WebGLShader;
import org.teavm.jso.webgl.WebGLTexture;
import org.teavm.jso.webgl.WebGLUniformLocation;

import net.lax1dude.eaglercraft.v1_8.internal.teavm.WebGLQuery;
import net.lax1dude.eaglercraft.v1_8.internal.teavm.WebGLVertexArray;

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
class OpenGLObjects {

	static class BufferGL implements IBufferGL {
		
		final WebGLBuffer ptr;
		
		BufferGL(WebGLBuffer ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteBuffers(this);
		}
		
	}

	static class BufferArrayGL implements IBufferArrayGL {
		
		final WebGLVertexArray ptr;
		
		BufferArrayGL(WebGLVertexArray ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteVertexArrays(this);
		}
		
	}

	static class TextureGL implements ITextureGL {
		
		final WebGLTexture ptr;
		
		TextureGL(WebGLTexture ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteTextures(this);
		}
		
	}

	static class ProgramGL implements IProgramGL {
		
		final WebGLProgram ptr;
		
		ProgramGL(WebGLProgram ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteProgram(this);
		}
		
	}

	static class UniformGL implements IUniformGL {
		
		final WebGLUniformLocation ptr;
		
		UniformGL(WebGLUniformLocation ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
		}
		
	}

	static class ShaderGL implements IShaderGL {
		
		final WebGLShader ptr;
		
		ShaderGL(WebGLShader ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteShader(this);
		}
		
	}

	static class FramebufferGL implements IFramebufferGL {
		
		final WebGLFramebuffer ptr;
		
		FramebufferGL(WebGLFramebuffer ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteFramebuffer(this);
		}
		
	}

	static class RenderbufferGL implements IRenderbufferGL {
		
		final WebGLRenderbuffer ptr;
		
		RenderbufferGL(WebGLRenderbuffer ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteRenderbuffer(this);
		}
		
	}

	static class QueryGL implements IQueryGL {
		
		final WebGLQuery ptr;
		
		QueryGL(WebGLQuery ptr) {
			this.ptr = ptr;
		}

		@Override
		public void free() {
			PlatformOpenGL._wglDeleteQueries(this);
		}
		
	}
	
}
