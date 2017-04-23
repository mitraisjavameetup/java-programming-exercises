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
	  double recent=-1;
	  double result=-1;
	  int counter = 0;
	  for(int i=0;i<1000;i++){
		  result=Math.round(Math.random());
		  if(result==recent){
			  counter++;
			  if(counter>=3){
				  String threadName = Thread.currentThread().getName();
				  if(result==1)
					  System.out.println(threadName + " got " + counter + " heads in a row!!");
				  else
					  System.out.println(threadName + " got " + counter + " tails in a row!!");
			  }
		  } else{
			  recent = result;
			  counter = 0;
		  }
	  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}