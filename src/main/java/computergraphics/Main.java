package computergraphics;

import java.awt.Color;
import java.awt.Graphics2D;

import base.graphics.app.GraphApp;
import base.graphics.app.Settings;

public class Main extends GraphApp {

	public Main() throws Exception {
		Settings settings = new Settings();
		settings.title = "Hello Computer Graphics in Java!";
		start(settings);
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}

	@Override
	public void drawFrameApp(Graphics2D g) {
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
	public void initApp() {
	}

	@Override
	public void updateApp(long elapsedTime) {
	}

	@Override
	public void finishOffApp() {
	}

	@Override
	public void printFinalStatsApp() {
	}

}
