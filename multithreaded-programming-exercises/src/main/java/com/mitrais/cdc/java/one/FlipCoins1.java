package com.mitrais.cdc.java.one;
import java.util.concurrent.*;

public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    
    
    //TODO: Instantiate ExcecutorService class with poolsize as stated above
    
    
    //TODO execute the CoinFlipper 5 times (or several times) concurrently 
    ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.execute(new CoinFlipper());
    taskList.shutdown();
     
    
    //TODO: do not forget to shutdown the executor
    
    
  }
}