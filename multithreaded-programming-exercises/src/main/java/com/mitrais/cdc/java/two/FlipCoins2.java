package com.mitrais.cdc.java.two;
import java.util.concurrent.*;


/**
 * Print if there's 3 or more consecutive result in a row with embed Runnable
 * @author Egi
 * @version 1.0
 */
public class FlipCoins2 implements Runnable {
  /**
   * FlipCoins2 constructor
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
    ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
    
    //TODO execute this 5 times (or several times) concurrently
    for (int i = 0; i < 5; i++) {
		taskList.execute(this);
	}
    
    //TODO: do not forget to shutdown the executor
    taskList.shutdown();
    
  }

  
  /** FlipCoins2 main method
   * FlipCoins2 main method
   * @param args
   */
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 /**
  * Embed runnable
  */
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
	int counter = 0;
	String result = "", lastResult = "";
	
	for (int i = 0; i < 1000; i++) {
		if (Math.random() < 0.5) {
			result = "heads";
		} else {
			result = "tails";
		}
		
		if (result == lastResult) {
			counter++;
			if (counter >= 3) {
				System.out.printf("%s got %s %s in a row!!%n", Thread.currentThread().getName(), counter, result);
			}
		} else {
			counter = 0;
		}
		
		lastResult = result;
	}
  
  }
}