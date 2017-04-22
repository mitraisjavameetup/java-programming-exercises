package com.mitrais.cdc.java.three;

import javax.swing.*;

public class LabelingCoinFlipper implements Runnable {
	private JLabel label;

	public LabelingCoinFlipper(JLabel label) {
		label.setText(String.format("Heads: %3d", 0));
		this.label = label;
	}

	@Override
	public void run() {
		int counterHead = 0;
		for (int i = 0; i < 1000; i++) {
			if (Math.random() <= 0.5) {
				counterHead++;
				label.setText(String.format("Heads: %3d", counterHead));
				pause(5);
			} else {
				pause(5);
			}
		}
		// TODO: create 'for' loop 1000 times
		// and also place counter in it.
		// Print something like this:
		// "Heads: 1!!"
		// or like this"
		// "Heads: 3"
		// do not forget to add "pause(5);" after change the label text
		// so you could see the entire process

	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException ie) {
		}
	}
}