package com.mitrais.cdc.java;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.DoubleStream;

public class Utils {
  
	private static Map<Integer,Integer> prime= new HashMap<>();
	
  public static List<Double> randomNumberList(int size) {
	  
	  /*
	   * TO DO 
	   * Make a static method that, given a size, will produce a List<Double> of that size, 
	   * each value of which is a random number between 0 and 1. 
	   * Use Math.random() and normal List methods.
	   *
	   */
	  List<Double> tampung=new ArrayList<Double>();
	  
	  for (int i=0;i<size;i++)
	  {
		  tampung.add(Math.random());
	  }
	  
	  return tampung;
  }
  
  public static double average(List<Double> nums) {
	
	  
	  /*
	   * TO DO
	   * Make a static method that, given a List<Double>, will output the average.
	   * Use normal List methods.
	   * (You can also use Stream methods if you can figure out 
	   * how to turn a List<Double> into a DoubleStream.)
	   * 
	   */
	  
	  return nums.stream().mapToDouble(e->e).average().getAsDouble();
	  
  }
  
  public static void removeBelow(List<Double> nums, double cutoff) {
	  
	  /*
	   * TO DO
	   * Make a static method that, given a List<Double> and a cutoff, 
	   * will modify the List so that all numbers
	   * below the cutoff are removed. 
	   * Use one of the methods from this lecture.
	   * 
	   */
	  nums.removeIf(e->e <cutoff);
  }
  
  public static void doubleAllValues(List<Double> nums) {
	  
	  /*
	   * TO DO
	   * Make a static method that, given a List<Double>, 
	   * will modify the List by doubling (multiplying by 2) all the values.
	   * Use one of the methods from this lecture
	   * 
	   */	  
	  nums.replaceAll(n -> n*2);
  }
  
  /** Returns the number of primes from 0 to this number, inclusive. */
  
  public static int countPrimes1(int upperBound) {
    if (upperBound <= 2) {
      return(1);
    }
    if (Primes.isPrime(upperBound)) {
      return(1 + countPrimes1(upperBound - 1));
    } else {
      return(countPrimes1(upperBound - 1));
    }
  }
  
  public static int countPrimes(int upperBound) {
	  
	  /*
	   * TO DO
	   * Use computeIfAbsent to make a memoized version of countPrimes1 method.
	   * Profile it and compare performance
	   *
	   */
	  
	  return prime.computeIfAbsent(upperBound, n->{
		  if (n <= 2) {
		      return(1);
		    }
		 if (Primes.isPrime(n)) {
		      return(1 + countPrimes1(n - 1));
		 } else {
		      return(countPrimes1(n - 1));
		    }
	  });
  }
}
