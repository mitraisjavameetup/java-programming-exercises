package com.mitrais.cdc.java;

/** NOTE
 * this is helper class to count the elapsed time
 * Please use the method to solve your problem
 */

@FunctionalInterface
public interface Op {
  void runOp();
  
  static double timeOp(Op operation) {
    long startTime = System.nanoTime();
    operation.runOp();
    long endTime = System.nanoTime();
    double oneBillion = 1_000_000_000;
    double elapsedSeconds = (endTime - startTime)/oneBillion;
    System.out.printf("  Elapsed time: %.3f seconds.%n", elapsedSeconds);
    return elapsedSeconds;
  }
  
  default Op combinedOp(Op secondOp) {
    return(() -> { runOp();
                   secondOp.runOp(); });
  }
}
