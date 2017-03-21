package com.mitrais.cdc.java.two;
import java.util.concurrent.*;


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
    ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
    for (int i = 0; i < 5; i++) {
 		tasks.execute(this);
 	}
    tasks.shutdown();
    //TODO: Instantiate ExcecutorService class with poolsize as stated above

    
    
    //TODO execute this 5 times (or several times) concurrently
    
    
    
    
    
    //TODO: do not forget to shutdown the executor
    
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	  boolean coin;
	  int heads = 0;
	  int tails = 0;
	  for (int i = 0; i < 1000; i++) {
		if(Math.random() > 0.5){
			coin = true;
			heads++;
			tails = 0;
		}
		else {
			coin = false;
			heads = 0;
			tails++;
		}
		if (heads >= 3) {
			System.out.println(Thread.currentThread().getName() + " got " + heads + "heads in a row!");
		}else if (tails >= 3) {
			System.out.println(Thread.currentThread().getName() + " got " + tails + "heads in a row!");
		}
		
	//TODO: Just copy run() method from question number 1 :)

  
  
  
  
  
  
  
  
  
  
  }
  }
}
