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
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
    
    //TODO execute this 5 times (or several times) concurrently
    for (int x = 0; x < 5; x++)
    	taskList.execute(this);
    
    //TODO: do not forget to shutdown the executor
    taskList.shutdown();    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
		int counter = 0;
		for (int x = 0; x < 1000; x++)
		{
			if (Math.random() >= 0.5)
				counter++;
			else
				counter = 0;
			
			if (counter >= 3)
				System.out.println(Thread.currentThread().getName() + " has got " + counter + " consecutive heads!");
		}
  }
}