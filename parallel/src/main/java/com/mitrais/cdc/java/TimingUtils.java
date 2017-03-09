package com.mitrais.cdc.java;


public class TimingUtils {
  private static final double ONE_BILLION = 1_000_000_000;
  
  public static void timeOp(Op operation) {
    long startTime = System.nanoTime();
    String resultMessage = operation.runOp();
    long endTime = System.nanoTime();
    System.out.println(resultMessage);
    double elapsedSeconds = (endTime - startTime)/ONE_BILLION;
    System.out.printf("  Elapsed time: %.3f seconds.%n", elapsedSeconds);
  }
}
