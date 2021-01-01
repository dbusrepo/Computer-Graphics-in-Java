package computergraphics;

import java.awt.Color;
import java.awt.Graphics2D;

import base.graphics.app.GraphicsApplication;
import base.graphics.app.Settings;

public class Main extends GraphicsApplication {

	public Main() {
		Settings settings = new Settings();
		settings.title = "Hello Computer Graphics in Java!";
		start(settings);
	}

	@Override
	protected void appDrawCanvas(Graphics2D g) {
		g.setBackground(Color.BLACK);
		g.clearRect(0, 0, getCanvas().getWidth(), getCanvas().getHeight());
		int maxX = getCanvas().getWidth() - 1;
		int maxY = getCanvas().getHeight() - 1;
		g.drawString("maxX = " + maxX, 10, 30);
		g.drawString("maxY = " + maxY, 10, 60);
		g.setColor(Color.RED);
		g.drawRect(0, 0, maxX, maxY);
//		g.drawLine(30, 50, 200, 150);
	}

	@Override
	protected void appInit() {
	}

	@Override
	protected void appUpdate(long elapsedTime) {
	}

	@Override
	protected void appFinishOff() {
	}

	@Override
	protected void appPrintFinalStats() {
	}

	public static void main(String[] args) {
		new Main();
	}
}
