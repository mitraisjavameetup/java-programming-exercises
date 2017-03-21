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
    tasks.execute(this);
    tasks.execute(this);
    tasks.execute(this);
    tasks.execute(this);
    tasks.execute(this);
    
    
    
    
    //TODO: do not forget to shutdown the executor
    tasks.shutdown();
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
	  boolean coin; //True = Head, false = Tail
	  int countHead=0;
	  int countTail=0;
	  String threadName = Thread.currentThread().getName();
	  for (int i = 1; i <= 1000; i++) {
		System.out.println(threadName+" Counter="+i);
		if (Math.random()<0.5) {
			coin = true;
			countHead++;
			countTail=0;
		}
		else {
			coin = false;
			countTail++;
			countHead=0;
		}
		if (countHead>=3) {
			System.out.println(threadName+" got "+countHead+" in a row");
		}else if (countTail>=3) {
			System.out.println(threadName+" got "+countTail+" in a row");
		}
		
	  }	
    
  }
}