package net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.program;

import static net.lax1dude.eaglercraft.v1_8.internal.PlatformOpenGL.*;
import static net.lax1dude.eaglercraft.v1_8.opengl.RealOpenGLEnums.*;

import net.lax1dude.eaglercraft.v1_8.internal.IProgramGL;
import net.lax1dude.eaglercraft.v1_8.internal.IShaderGL;
import net.lax1dude.eaglercraft.v1_8.internal.IUniformGL;

/**
 * Copyright (c) 2023 lax1dude. All Rights Reserved.
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
public class PipelineShaderCloudsSample extends ShaderProgram<PipelineShaderCloudsSample.Uniforms> {

	public static PipelineShaderCloudsSample compile() {
		IShaderGL cloudsSample = ShaderCompiler.compileShader("clouds_sample", GL_FRAGMENT_SHADER,
				ShaderSource.clouds_sample_fsh);
		try {
			IProgramGL prog = ShaderCompiler.linkProgram("clouds_sample", SharedPipelineShaders.deferred_local, cloudsSample);
			return new PipelineShaderCloudsSample(prog);
		}finally {
			if(cloudsSample != null) {
				cloudsSample.free();
			}
		}
	}

	private PipelineShaderCloudsSample(IProgramGL prog) {
		super(prog, new Uniforms());
	}

	public static class Uniforms implements IProgramUniforms {

		public IUniformGL u_rainStrength1f = null;
		public IUniformGL u_densityModifier4f = null;
		public IUniformGL u_sampleStep1f = null;
		public IUniformGL u_cloudTimer1f = null;
		public IUniformGL u_cloudOffset3f = null;
		public IUniformGL u_sunDirection3f = null;
		public IUniformGL u_sunColor3f = null;

		private Uniforms() {
		}

		@Override
		public void loadUniforms(IProgramGL prog) {
			u_rainStrength1f = _wglGetUniformLocation(prog, "u_rainStrength1f");
			u_densityModifier4f = _wglGetUniformLocation(prog, "u_densityModifier4f");
			u_sampleStep1f = _wglGetUniformLocation(prog, "u_sampleStep1f");
			u_cloudTimer1f = _wglGetUniformLocation(prog, "u_cloudTimer1f");
			u_cloudOffset3f = _wglGetUniformLocation(prog, "u_cloudOffset3f");
			u_sunDirection3f = _wglGetUniformLocation(prog, "u_sunDirection3f");
			u_sunColor3f = _wglGetUniformLocation(prog, "u_sunColor3f");
			_wglUniform1i(_wglGetUniformLocation(prog, "u_noiseTexture3D"), 0);
			_wglUniform1i(_wglGetUniformLocation(prog, "u_skyIrradianceMap"), 1);
		}

	}

}
