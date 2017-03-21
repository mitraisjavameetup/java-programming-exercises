package com.mitrais.cdc.java.one;

public class CoinFlipper implements Runnable {
	/** override function run, flip coin and count face in a row */
	@Override
	public void run() {
		//TODO: create 'for' loop 1000 times
		//and also place counter in it.
		//each time number in counter >= 3, print something like this:
		//"Pool-1-thread-1 got 3 heads in a row!!"
		//or like this"
		//"Pool-1-thread-2 got 5 heads in a row!!"
		int counter = 0;
		boolean heads = false;
		for(int i=0;i<1000;i++){
			if(Math.random() >= 0.5){
				if(!heads){
					counter = 0;
					heads=true;
				}
				counter++;
				if(counter >= 3){
					System.out.printf("%s got %d heads in a row!!%n", Thread.currentThread().getName(),counter);
				}
			}
			else{
				if(heads){
					counter = 0;
					heads = false;
				}
				counter++;
				if(counter >= 3){
					System.out.printf("%s got %d tails in a row!!%n", Thread.currentThread().getName(),counter);
				}
			}
		}
	}
}