
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 3  @  2 : 8

~ import net.lax1dude.eaglercraft.v1_8.opengl.GlStateManager;

> DELETE  1  @  1 : 2

> CHANGE  27 : 29  @  27 : 29

~ 		for (int i = 0, l = this.buttonList.size(); i < l; ++i) {
~ 			this.buttonList.get(i).enabled = false;

> CHANGE  4 : 5  @  4 : 5

~ 	protected void keyTyped(char parChar1, int parInt1) {

> CHANGE  2 : 3  @  2 : 3

~ 	protected void actionPerformed(GuiButton parGuiButton) {

> CHANGE  7 : 15  @  7 : 8

~ 				if (this.mc.isIntegratedServerRunning()) {
~ 					this.mc.thePlayer.respawnPlayer();
~ 					this.mc.displayGuiScreen((GuiScreen) null);
~ 				} else {
~ 					this.mc.theWorld.sendQuittingDisconnectingPacket();
~ 					this.mc.loadWorld((WorldClient) null);
~ 					this.mc.shutdownIntegratedServer(new GuiMainMenu());
~ 				}

> CHANGE  15 : 16  @  15 : 16

~ 			this.mc.shutdownIntegratedServer(new GuiMainMenu());

> CHANGE  34 : 36  @  34 : 36

~ 			for (int i = 0, l = this.buttonList.size(); i < l; ++i) {
~ 				this.buttonList.get(i).enabled = true;

> EOF
