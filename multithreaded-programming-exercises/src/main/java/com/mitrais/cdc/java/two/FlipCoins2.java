package com.mitrais.cdc.java.two;
import java.util.concurrent.*;

import com.mitrais.cdc.java.one.CoinFlipper;

/** Second variation: main class implements Runnable.
 */

public class FlipCoins2 implements Runnable {
  
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
    ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
    
    
    //TODO execute this 5 times (or several times) concurrently
    for (int i=0 ; i<5; i++) {
    	tasks.execute(new CoinFlipper());
    }
    
    
    
    
    //TODO: do not forget to shutdown the executor
    tasks.shutdown();
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
	  int counterHead = 0;
		 int counterTail = 0;
		 for (int i = 0; i < 1000; i++){
			 if (Math.random() <0.5){
		 		counterHead++;
		 		counterTail=0;
	  } else {
		  counterTail++;
		  counterHead=0;
	  
	  }
			 if (counterHead >=3){
				 System.out.println(Thread.currentThread().getName() + "got" + counterHead + "Head in a Row");
			 }else{
				 if (counterTail >=3){
					 System.out.println(Thread.currentThread().getName() + "got" + counterTail + "Tail in a Row");
				 }
			 }
  
  
  
  
  
  
  
  
		 }
  
  }
}