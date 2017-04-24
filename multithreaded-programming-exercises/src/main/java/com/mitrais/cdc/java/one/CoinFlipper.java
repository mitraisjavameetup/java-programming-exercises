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
	  int counter=0;
	  int flag=0;
	  
	  for (int i=0;i<1000;i++)
	  {
		  
		  if (Math.random()<0.5)
		  {
			  flag=0;
		  }
		  else 
		  {
			  flag=1;
		  }
		  
		  if (flag==0)
		  {
			  counter++;
			  if (counter>=3)
			  {
				  System.out.println(Thread.currentThread().getName()+" "+counter+ "heads in a row");
			  }
		  }
		  else
		  {
			  counter=0;
		  }
		 
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}