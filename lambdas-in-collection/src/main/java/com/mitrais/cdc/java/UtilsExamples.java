package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	  List<Double> result = new ArrayList<>();
	  for (int i = 0; i < size; i++) {
		  result.add(Math.random());
	  }
	  List<Double> resultFilter = result.stream().filter(s-> s > cutoff).collect(Collectors.toList());
	  return resultFilter.stream().mapToDouble(Double::new).average().orElse(0);
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

	  List<Double> result = new ArrayList<>();
	  for (int i = 0; i < size; i++) {
		  result.add(Math.random());
	  }
	  List<Double> resultFilter = result.stream().map(s->s*2).collect(Collectors.toList());
	  return resultFilter.stream().mapToDouble(Double::new).average().orElse(0);
    
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
