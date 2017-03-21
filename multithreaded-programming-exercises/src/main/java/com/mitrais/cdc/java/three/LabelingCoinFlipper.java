package com.mitrais.cdc.java.three;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class LabelingCoinFlipper implements Runnable {
	private JLabel label;

	public LabelingCoinFlipper(JLabel label) {
		label.setText(String.format("Heads: %3d", 0));
		this.label = label;
	}

	@Override
	public void run() {
		pause(200);

		// TODO: create 'for' loop 1000 times
		// and also place counter in it.
		// Print something like this:
		// "Heads: 1!!"
		// or like this"
		// "Heads: 3"
		// do not forget to add "pause(5);" after change the label text
		// so you could see the entire process
		int counter = 0;
		for (int i = 1; i <= 1000; i++) {
			if (ThreadLocalRandom.current().nextInt(2) == 0) {
				counter++;
			}
			
			if (counter >= 1) {
				label.setText("Heads: "+counter);
				pause(100);
			}
		}
	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}