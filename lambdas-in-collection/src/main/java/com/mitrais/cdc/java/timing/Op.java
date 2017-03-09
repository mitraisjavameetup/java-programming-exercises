package com.mitrais.cdc.java.timing;

/** Represents an operation that we will want to time. 
 *  Added a static and default method to the interface
 *  that we had used earlier.
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
