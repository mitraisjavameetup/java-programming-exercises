package com.mitrais.cdc.java.two;
import java.util.concurrent.*;

/** Second variation: main class implements Runnable.
 */
/**
 * 
 * @author Relung Satria
 * Coin Flipper class
 *
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
	  

    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    
    
    //TODO execute this 5 times (or several times) concurrently
    
    
    
    
    
    //TODO: do not forget to shutdown the executor
    
    
  }

  
  
 public static void main(String[] args) {
	 int poolSize = 10;
	 ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
	 for(int i = 0; i < 10; i++){
		 tasks.execute(new FlipCoins2());
	 }
     tasks.shutdown();
 }
 
 
 
	//TODO: Just copy run() method from question number 1 :)

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