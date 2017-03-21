package com.mitrais.cdc.java.one;

/**
 * 
 * @author trainee
 * coinFlipper Class
 */
public class CoinFlipper implements Runnable {
	/**
	 * method to flip coin
	 */
  @Override
  public void run() {
	  
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"  
	  int counter=0;
	  boolean head=true;
	  for(int i=0;i<1000;i++){
		  double decider=Math.random();
		  if(decider<=0.5){
			  if(head)counter+=1;
			  else {head=true;}
		  }
		  else{
			  
			  counter=0;head=false;
		  }
		  if(counter>=3)System.out.println(Thread.currentThread().getName()+" got "+counter+" heads in a row!!");
	  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}