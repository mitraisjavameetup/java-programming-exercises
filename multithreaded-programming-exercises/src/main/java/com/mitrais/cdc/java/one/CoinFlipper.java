package com.mitrais.cdc.java.one;
/**
 * 
 * @author Relung Satria
 * Coin Flipper class
 *
 */
public class CoinFlipper implements Runnable {
	private Thread t;
	
	CoinFlipper(){
		
	}
	
  @Override
  public void run() {
	int counter = 0;
	  for(int i = 0; i < 1000; i++){
		  double rand = Math.random();
		  if(rand <= 0.5){
			  counter++;
		  } else {
			  counter = 0;
		  }
		  
		  if(counter >= 3){
			  System.out.printf("%s got %d heads in a row!!%n", Thread.currentThread().getName(), counter);
		  }
	  }  
  }
}