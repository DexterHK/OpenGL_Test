package renderer;


import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.*;
import org.lwjgl.glfw.GLFW;
public class Window {
	public long windowID;
	public void createWindow(int width, int height, String title )
	{
	boolean initState = GLFW.glfwInit();
	
	if(initState == false)
	{
		throw new IllegalStateException("könnte nicht glfwInit initialisieren");
	}
	windowID = GLFW.glfwCreateWindow(width, height, title, MemoryUtil.NULL, MemoryUtil.NULL);
		
	if(windowID == MemoryUtil.NULL)
	{
		throw new IllegalStateException("könnte nicht das Fenster(window) öffnen"); 
	}
		GLFW.glfwMakeContextCurrent(windowID);
		GLFW.glfwSwapInterval(1);
		GLFW.glfwShowWindow(windowID);
		GL.createCapabilities();
	}
	
	public void updateWindow()
	{
		GLFW.glfwSwapBuffers(windowID);
		GLFW.glfwPollEvents();
		GLFW.glfwSwapInterval(1);
		
		
	}
	public void closeWindow()
	{
	GLFW.glfwDestroyWindow(windowID);
	GLFW.glfwTerminate();	
	
	}
	public boolean shouldClose()
	{
		return GLFW.glfwWindowShouldClose(windowID);
	}
	
}
