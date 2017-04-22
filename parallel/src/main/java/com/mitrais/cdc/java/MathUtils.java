package com.mitrais.cdc.java;

import java.util.*;
import java.util.concurrent.*;

public class MathUtils {
  private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
  
  /** Insert boolean value to primeFlags array
   * 
   */
  public static void markPrimesSerial(boolean[] primeFlags, 
                                      int lowerIndex, int upperIndex) {
	  // To Do : One simple line of code that uses Primes.isPrime
	  
			for(int i=lowerIndex; i<=upperIndex; i++){
				  if(Primes.isPrime(i)){
					  primeFlags[i] = true;
				  }
				  else{
					  primeFlags[i] = false;
				  }
			  }
	  
	  
  }
  
  /** Mark the primes with calling markPrimesSerial method
   *  
   */
  public static void markPrimesSerial(boolean[] primeFlags) {
    TimingUtils.timeOp(new Op(){

		@Override
		public String runOp() {
			// TODO Auto-generated method stub
			markPrimesSerial(primeFlags, 0, primeFlags.length-1);
			return "Serial";
		}
		  
	  });
	  
  }
  
  /** Mark the primes with calling ParallelPrimeMarker method
   *  
   */
  public static void markPrimesParallel(boolean[] primeFlags) {
	  // To Do : create parallel version of mark primes
	  TimingUtils.timeOp(new Op(){

		@Override
		public String runOp() {
			// TODO Auto-generated method stub
			FORK_JOIN_POOL.invoke(new ParallelPrimeMarker(primeFlags, 0, primeFlags.length-1)) ;
			return "Parallel";
		}
		  
	  });
  }
  
  /** Collect and return list of marked prime numbers from array
   */
  public static List<Integer> collectPrimes(boolean[] primeFlags) {
	  // To Do : collect and return list of marked prime numbers from array
	  List<Integer> primeNumber = new ArrayList<Integer>();
	  for(int i=0; i<primeFlags.length; i++){
		  if(primeFlags[i] == true){
			  primeNumber.add(i);
		  }
	  }
	  return primeNumber;
  }
  
  /** Collect and return list of marked prime numbers given the empty boolean array
   */
  
  public static List<Integer> findPrimesSerial(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  markPrimesSerial(primeFlags);
	  return collectPrimes(primeFlags);
  }
  
  /** Collect and return list of marked prime numbers from given only the size
    */
  
  public static List<Integer> findPrimesSerial(int size) {
	// To Do : collect and return list of marked prime numbers from given only the size
	  boolean [] primeFlags = new boolean[size];
	  markPrimesSerial(primeFlags);
	  return collectPrimes(primeFlags);
  }
  
  /** Collect and return list of marked prime numbers given the empty boolean array
   */
  
  public static List<Integer> findPrimesParallel(boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  
	  markPrimesParallel(primeFlags);
	  return collectPrimes(primeFlags);
  }
  
  /** Collect and return list of marked prime numbers from given only the size*/
  
  public static List<Integer> findPrimesParallel(int size) {
    // To Do : collect and return list of marked prime numbers from given only the size
	  boolean [] primeFlags = new boolean[size];
	  markPrimesParallel(primeFlags);
    return collectPrimes(primeFlags);
  }
  
}
