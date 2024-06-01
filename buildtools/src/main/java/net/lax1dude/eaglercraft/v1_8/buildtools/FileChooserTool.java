package net.lax1dude.eaglercraft.v1_8.buildtools;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

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
public class FileChooserTool {
	
	public static final JFileChooser fc = new JFileChooser();
	
	public static File load(boolean directory) {
		fc.setFileSelectionMode(directory ? JFileChooser.DIRECTORIES_ONLY : JFileChooser.FILES_ONLY);
		fc.setMultiSelectionEnabled(false);
		fc.setFileHidingEnabled(false);
		fc.setDialogTitle("Eaglercraft Buildtools");
		JFrame parent = new JFrame();
		parent.setBounds(0, 0, 50, 50);
		parent.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		parent.setAlwaysOnTop(true);
		parent.setTitle("File Chooser");
		parent.setLocationRelativeTo(null);
		parent.setVisible(true);
		if(fc.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
			parent.dispose();
			return fc.getSelectedFile();
		}else {
			parent.dispose();
			return null;
		}
	}
	
}
