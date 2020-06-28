package com.busatod.graphics.cgbook;

import com.busatod.graphics.app.GraphicsApplication;
import com.busatod.graphics.app.Settings;

public class ComputerGraphics extends GraphicsApplication
{
	public ComputerGraphics()
	{
		Settings settings = new Settings();
		settings.title = "Hello Computer Graphics!";
		start(settings);
	}
	
	@Override
	protected void appInit()
	{
	
	}
	
	@Override
	protected void appUpdate(long elapsedTime)
	{
	
	}
	
	@Override
	protected void appFinishOff()
	{
	
	}
	
	@Override
	protected void appPrintFinalStats()
	{
	
	}
	
	public static void main(String[] args)
	{
		new ComputerGraphics();
	}
}
