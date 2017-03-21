package com.mitrais.cdc.java.three;

import java.awt.event.*;

/**
 * A listener that you attach to the top-level window of your application, so
 * that quitting the frame exits the application. If you are using applets,
 * change System.exit(0) to dispose().
 */

public class ExitListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent event) {
		System.exit(0);
	}
}