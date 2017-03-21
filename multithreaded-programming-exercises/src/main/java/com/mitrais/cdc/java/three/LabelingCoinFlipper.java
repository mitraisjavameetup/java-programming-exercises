package com.mitrais.cdc.java.three;
import javax.swing.*;

/**
 * CoinFlipper that output the result in the JFrame
 * @author Egi
 * @version 1.0
 */
public class LabelingCoinFlipper implements Runnable {
  private JLabel label;

  /**
   * LabelingCoinFlipper constructor
   * @param label
   */
  public LabelingCoinFlipper(JLabel label) {
    label.setText(String.format("Heads: %3d", 0));
    this.label = label;
  }

  /**
   * LabelingCoinFlipper runnable
   */
  @Override
  public void run() {
    pause(200);
    
    //TODO: create 'for' loop 1000 times
  	//and also place counter in it.
  	//Print something like this:
  	//"Heads: 1!!"
  	//or like this"
  	//"Heads: 3"  
    //do not forget to add "pause(5);" after change the label text
    //so you could see the entire process

	int counter = 0;
	String result = "", lastResult = "";
	
	for (int i = 0; i < 1000; i++) {
		if (Math.random() < 0.5) {
			counter++;
			result = "heads";
		    label.setText(String.format("Heads : %s!!%n", counter));
		    pause(5);
		}
	}
    
  }

  private static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch(InterruptedException ie) {}
  }
}