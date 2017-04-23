package com.mitrais.cdc.java.two;
import java.util.concurrent.*;

import com.mitrais.cdc.java.one.CoinFlipper;

/** Second variation: main class implements Runnable.
 */
/**
 * 
 * @author trainee
 * FlipCoins2 class
 */
public class FlipCoins2 implements Runnable {
  /**
   * FLipCoins2 constructor
   */
  public FlipCoins2() {
	// Note that you cannot do tasks.execute(this) directly from main.
	// When you are in main, no instance of the surrounding class has
	// yet been created, so there *IS* no "this". So, here main calls
	// the constructor of the class, and that constructor does tasks.execute(this).
	  
	// Similarly, you cannot make
	// an instance of an inner class directly from main. Again, this is because
    // in main, the outer class has not yet been built.
	  
    int poolSize = 10;
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService taskList=Executors.newFixedThreadPool(poolSize);
    
    
    //TODO execute this 5 times (or several times) concurrently
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    
    
    
    
    //TODO: do not forget to shutdown the executor
    taskList.shutdown();
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 /**
  * method to flipcoins with multithread
  */
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
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