package com.mitrais.cdc.java.one;
import java.util.concurrent.*;
/**
 * 
 * @author Relung Satria
 * Coin Flipper main class
 *
 */
public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
    for(int i = 0; i < poolSize; i++)
    	tasks.execute(new CoinFlipper());
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 
    tasks.shutdown();
    
    
    
    //TODO: do not forget to shutdown the executor
    
    
  }
}