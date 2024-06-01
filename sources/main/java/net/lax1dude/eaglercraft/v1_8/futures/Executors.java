package net.lax1dude.eaglercraft.v1_8.futures;

import java.util.concurrent.Callable;

/**
 * Copyright (c) 2022-2023 lax1dude, ayunami2000. All Rights Reserved.
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
public class Executors {

	public static <T> Callable<T> callable(Runnable task, T result) {
		if (task == null)
			throw new NullPointerException();
		return new RunnableAdapter<T>(task, result);
	}

	public static Callable<Object> callable(Runnable task) {
		if (task == null)
			throw new NullPointerException();
		return new RunnableAdapter<Object>(task, null);
	}

	static final class RunnableAdapter<T> implements Callable<T> {
		final Runnable task;
		final T result;

		RunnableAdapter(Runnable task, T result) {
			this.task = task;
			this.result = result;
		}

		public T call() {
			task.run();
			return result;
		}
	}

}
