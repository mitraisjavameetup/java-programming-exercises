package com.mitrais.cdc.java.one;
import java.util.concurrent.*;

public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 
    executorService.execute(new CoinFlipper());
    executorService.execute(new CoinFlipper());
    executorService.execute(new CoinFlipper());
    executorService.execute(new CoinFlipper());
    executorService.execute(new CoinFlipper());
    
    //TODO: do not forget to shutdown the executor
    executorService.shutdown();
    
  }
}