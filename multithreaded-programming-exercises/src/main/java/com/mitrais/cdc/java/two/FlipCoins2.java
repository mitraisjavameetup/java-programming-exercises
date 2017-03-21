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
    int runTimes = 5;
    for(int i = 0;i<runTimes;i++)
    {
    	taskList.execute(this);
    }
    
    
    
    
    //TODO: do not forget to shutdown the executor
    taskList.shutdown();
    
  }

  
  
 public static void main(String[] args) {
   new FlipCoins2();
 }
 
 
 
  @Override
  public void run() {
	//TODO: Just copy run() method from question number 1 :)
	  int resultBefore = -1;//-1=first time;0 = head;1 = tails
	  String headOrTails = "";
	  double rand;
	  int counter = 0;
	  String threadName = Thread.currentThread().getName();
	  for (int i= 0;i<1000;i++)
	  {
		  rand = Math.random();
		  if (rand<0.5)
		  {
			  headOrTails = "Head";
			  if (resultBefore == 0)
			  {
				  counter+=1;
			  }
			  resultBefore = 0;
		  }else
		  {
			  headOrTails = "Tail";
			  resultBefore = 1;
			  counter = 0;
		  }
		  System.out.printf("%s-%s.%n",threadName,headOrTails);
		  if (counter >=3)
		  {
			  System.out.printf("%s got %s heads in a row!!.%n",threadName,counter);
		  }
		  pause();
	  }
  }
  private void pause()
  {
	  try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}