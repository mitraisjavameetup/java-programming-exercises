package com.mitrais.cdc.java;


import java.util.concurrent.*;

/**
 * Class for mark prime number with parallel approach
 * @author Egi
 * @version 1.0
 */
public class ParallelPrimeMarker extends RecursiveTask<Void> {
  private static final int PARALLEL_CUTOFF = 10;
  private boolean[] primeFlags;
  private int lowerIndex, upperIndex;
  
  /**
   * ParallelPrimeMarker class constructor
   * @param primeFlags
   * @param lowerIndex
   * @param upperIndex
   */
  public ParallelPrimeMarker(boolean[] primeFlags, int lowerIndex, int upperIndex) {
    this.primeFlags = primeFlags;
    this.lowerIndex = lowerIndex;
    this.upperIndex = upperIndex;
  }

  @Override
  protected Void compute() {
    int range = upperIndex - lowerIndex;
    if (range <= PARALLEL_CUTOFF) {
      MathUtils.markPrimesSerial(primeFlags, lowerIndex, upperIndex);
    } else {
      int middleIndex = lowerIndex + range/2;
      ParallelPrimeMarker leftMarker = 
        new ParallelPrimeMarker(primeFlags, lowerIndex, middleIndex);
      ParallelPrimeMarker rightMarker = 
        new ParallelPrimeMarker(primeFlags, middleIndex+1, upperIndex);
      leftMarker.fork();
      rightMarker.compute();
      leftMarker.join();
    }
    return(null);
  }
}
