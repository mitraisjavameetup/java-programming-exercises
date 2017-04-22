package com.mitrais.cdc.java;

import java.awt.event.*;

/**
 * The listener used by ColorPanel1. Calls back to public method in main panel.
 * 
 */

public class ColorListener extends MouseAdapter {
	private ColorPanel1 window;

	public ColorListener(ColorPanel1 window) {
		this.window = window;
	}

	@Override
	public void mousePressed(MouseEvent event) {
		window.swapColors();
	}
}
