package com.mitrais.cdc.java.one;
import java.util.concurrent.*;

/**
 * Print if there's 3 or more consecutive result in a row using CoinFlipper
 * @author Egi
 * @version 1.0
 */
public class FlipCoins1 {
  /**
   * FlipCoins1 main method
   * @param args
   */
  public static void main(String[] args) {
    int poolSize = 10;
    
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 
    for (int i = 0; i < 5; i++) {
		taskList.execute(new CoinFlipper());
	}
    
    //TODO: do not forget to shutdown the executor
    taskList.shutdown();
    
  }
}