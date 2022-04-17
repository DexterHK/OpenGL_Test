package Main;

import org.lwjgl.opengl.GL11;

import renderer.Window;

public class MainApplication {

	public static void main(String[] args) {
		Window window = new Window();
		window.createWindow(1280, 720, "Test Game");
		
	while(!window.shouldClose())
	{
		//Backgroundcolor
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(0, 0, 0,0);
		window.updateWindow();
	}
	window.closeWindow();
	}

}
