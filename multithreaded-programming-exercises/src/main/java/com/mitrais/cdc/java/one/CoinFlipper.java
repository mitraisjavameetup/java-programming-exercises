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
	 int counterHead = 0;
	 int counterTail = 0;
	 for (int i = 0; i < 1000; i++){
		 if (Math.random() <0.5){
	 		counterHead++;
	 		counterTail=0;
  } else {
	  counterTail++;
	  counterHead=0;
  
  }
		 if (counterHead >=3){
			 System.out.println(Thread.currentThread().getName() + "got" + counterHead + "Head in a Row");
		 }else{
			 if (counterTail >=3){
				 System.out.println(Thread.currentThread().getName() + "got" + counterTail + "Tail in a Row");
			 }
		 }
  }
}
}