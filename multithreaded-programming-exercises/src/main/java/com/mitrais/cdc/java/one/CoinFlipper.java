package com.mitrais.cdc.java.one;

public class CoinFlipper implements Runnable {
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"
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