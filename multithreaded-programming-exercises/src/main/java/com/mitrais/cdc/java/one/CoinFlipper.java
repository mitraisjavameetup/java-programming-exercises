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
	  int countHead = 0;
	  int countTail = 0;
	  String threadName = Thread.currentThread().getName();
	  for(int i=0; i<1000; i++){
		  if(flipCoin()){
			  if(countHead > 0) countHead++;
			  else if(countHead == 0) countHead = 1;
			  countTail = 0;
		  }
		  else{
			  if(countTail > 0) countTail++;
			  else if(countTail == 0) countTail = 1;
			  countHead = 0;
		  }

		  if(countHead >=3 ) System.out.println(threadName+" got "+countHead+" Heads in a row!!");
		  if(countTail >=3 ) System.out.println(threadName+" got "+countTail+" Tails in a row!!");
	  }  
	  
  }
  public boolean flipCoin(){
	  double temp = Math.random();
	  if(temp<0.5) return true;
	  else return false;
  }
}