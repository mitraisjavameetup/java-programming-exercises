package com.mitrais.cdc.java.one;
import java.util.concurrent.*;
/**
 * Thread example
 * @author Agus Mistiawan
 *
 */

public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 
    tasks.execute(new CoinFlipper());
    tasks.execute(new CoinFlipper());
    tasks.execute(new CoinFlipper());
    tasks.execute(new CoinFlipper());
    tasks.execute(new CoinFlipper());
    
    
    //TODO: do not forget to shutdown the executor
    tasks.shutdown();
    
  }
}