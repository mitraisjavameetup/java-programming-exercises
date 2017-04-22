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
    pause(200);
    
    //TODO: create 'for' loop 1000 times
  	//and also place counter in it.
  	//Print something like this:
  	//"Heads: 1!!"
  	//or like this"
  	//"Heads: 3"  
    //do not forget to add "pause(5);" after change the label text
    //so you could see the entire process
    
    boolean coin; //True = Head, false = Tail
	  int countHead=0;
	  int countTail=0;
//	  String threadName = Thread.currentThread().getName();
	  for (int i = 1; i <= 1000; i++) {
		
		if (Math.random()<0.5) {
			coin = true;
			countHead++;
//			countTail=0;
		}
		else {
			coin = false;
			countTail++;
//			countHead=0;
		}
		
		label.setText(String.format("Heads: %3d", countHead));
		pause(5);
	  }	 
    
    
    
    
    
    
  }

  private static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch(InterruptedException ie) {}
  }
}