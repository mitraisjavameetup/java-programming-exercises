package com.mitrais.cdc.java.three;

import javax.swing.*;

public class LabelingCoinFlipper implements Runnable {
	private JLabel label;
	private int consecutive;

	public LabelingCoinFlipper(JLabel label) {
		label.setText(String.format("Heads: %3d", 0));
		this.label = label;
	}

	@Override
	public void run() {
		// TODO: create 'for' loop 1000 times
		// and also place counter in it.
		// Print something like this:
		// "Heads: 1!!"
		// or like this"
		// "Heads: 3"
		// do not forget to add "pause(5);" after change the label text
		// so you could see the entire process
		int rand = 0;
		for (int i = 0; i < 1000; i++) {
			rand = ((int) (Math.random() * 10));
			if (rand % 2 == 0) {
				consecutive++;
			} else {
				if (consecutive >= 3) {
					String str = String
							.format(Thread.currentThread().getName() + " has " + consecutive + " head in a row");
					this.label.setText(str);

				}

				consecutive = 0;
			}

			pause(20);

		}

	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException ie) {
		}
	}
}