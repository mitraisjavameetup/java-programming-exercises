package com.mitrais.cdc.java.three;
import javax.swing.*;
import javax.swing.plaf.SliderUI;

/**
 * 
 * @author trainee
 * LabellingCoinFlipper class
 */
public class LabelingCoinFlipper implements Runnable {
  private JLabel label;

  public LabelingCoinFlipper(JLabel label) {
    label.setText(String.format("Heads: %3d", 0));
    this.label = label;
  }

  @Override
  /**
   * coin flips method
   */
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
    int counter=0;
	boolean head=true;
    for(int i=0;i<1000;i++){
    	double decider=Math.random();
	  if(decider<=0.5){
			  counter+=1;
			  label.setText(String.format("Heads: %3d", counter));
		    	
		  }
	  pause(5);
    	
    }
    
    
    
    
    
    
    
  }

  private static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch(InterruptedException ie) {}
  }
}