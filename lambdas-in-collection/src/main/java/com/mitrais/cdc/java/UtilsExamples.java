package com.mitrais.cdc.java;

import java.util.*;

import com.mitrais.cdc.java.timing.Op;

public class UtilsExamples { 


  
  public static double showAverages1(int size, double cutoff) {
	  
	  /* 
	   * TO DO
	   * Make a large list containing random numbers between 0 and 1.
	   * Compute the average and verify that it is near to 0.5. 
	   * Remove the numbers less than 0.5. 
	   * Compute the average again and verify that it is near to 0.75.
	   *
	   */
	  List<Double> list = Utils.randomNumberList(size);
	  double average = Utils.average(list);
	  System.out.println(average);
	  Utils.removeBelow(list, 0.5);
	  average = Utils.average(list);
	  System.out.println(average);
	  return average;
  }
  
  public static double showAverages2(int size) {
	  
	  /*
	   * TO DO
	   * Make a large list containing random numbers between 0 and 1. 
	   * Compute the average and verify that it is near to 0.5.
	   * Double all the values.
	   * Compute the average again and verify that it is near to 1.0.
	   * 
	   */
	  List<Double> list = Utils.randomNumberList(size);
	  double average = Utils.average(list);
	  System.out.println(average);
	  Utils.doubleAllValues(list);
	  average = Utils.average(list);
	  System.out.println(average);
	  return average;
    
  }
  
  private static int cutoff = 1_000;
  
  public static boolean profilePrimeCounts() {
	  double primes1Time = 0;
	  double primesTime = 0;
	  
	  for(int i=0; i<9; i++) {
	      primes1Time = Op.timeOp(() -> System.out.printf("Number of primes up to %,d is %,d [version 1].%n", cutoff, Utils.countPrimes1(cutoff)));
	      primesTime = Op.timeOp(() -> System.out.printf("Number of primes up to %,d is %,d [version 2].%n", cutoff, Utils.countPrimes(cutoff)));
	      cutoff = cutoff + 1_000;
	      primes1Time += primes1Time;
	      primesTime +=primesTime;
	  }
	  
	  return (primes1Time > primesTime);
  }  
  
}
