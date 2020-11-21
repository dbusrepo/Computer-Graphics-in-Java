package comp.grafx;

import base.graphics.app.GraphicsApplication;
import base.graphics.app.Settings;

public class Main extends GraphicsApplication {

	public Main() {
		Settings settings = new Settings();
		settings.title = "Hello Java Graphics!";
		start(settings);
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