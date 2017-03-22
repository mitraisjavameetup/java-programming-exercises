package com.mitrais.cdc.java;

import java.util.*;
import java.util.concurrent.*;
/**
 * 
 * @author trainee
 * MathUtils Class
 */
public class MathUtils {
  private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
  
  /** Make an ordinary (serial) method that, given a boolean[], will loop down the array and mark each
   * entry as true or false, depending on whether that index is prime. For example, array[0] and array[1]
   * should be false (0 and 1 are not prime), array[2] and array[3] should be true (2 and 3 are prime),
   * array[4] should be false (4 is not prime), array[5] should be true (5 is prime), and so forth.
   * Notes:
   * � Use Primes.isPrime(number) to test whether a number is prime. This method is already built in to
   * the Primes class that you copied from the fork-join-exercises project.
   * � To simplify the later parallel version, break your code into two methods, one that takes the whole
   * array and one that takes the array and two indices.
   */
  /**
   * mark each entry of primeFlags
   * @param primeFlags
   * @param lowerIndex
   * @param upperIndex
   */
  public static void markPrimesSerial(boolean[] primeFlags, 
                                      int lowerIndex, int upperIndex) {
	  // To Do : One simple line of code that uses Primes.isPrime
	  for(int i=lowerIndex;i<=upperIndex;i++)primeFlags[i]=Primes.isPrime(i);
	
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Serial version that
   *  marks all entries in the array.
   */
  /**
   * mark each entry of primeFlags
   * @param primeFlags
   */
  public static void markPrimesSerial(final boolean[] primeFlags) {
	 TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			markPrimesSerial(primeFlags, 0, primeFlags.length-1);
			return "markPrimesSerial";
		}
	});
    
  }
  
  /** Marks each entry i with true or false depending on
   *  whether i is prime or not. Parallel version that
   *  marks all entries in the array.
   */
  /**
   * mark each entry of primeFlags paralelly
   * @param primeFlags
   */
  public static void markPrimesParallel(final boolean[] primeFlags) {
	  // To Do : create parallel version of mark primes
	 
	 TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			FORK_JOIN_POOL.invoke(new ParallelPrimeMarker(primeFlags, 0, primeFlags.length-1));
			return "markPrimesParallel";
		}
	});
  }
  
  /** Given an already-marked boolean[] of flags that says
   *  whether each index is prime or not, produces a List
   *  of the primes. Used by both the serial and parallel versions.
   */
  /**
   * produces a list of primes from marked boolean[]
   * @param primeFlags
   * @return List<Integer>
   */
  public static List<Integer> collectPrimes(boolean[] primeFlags) {
	  // To Do : collect and return list of marked prime numbers from array
	  List<Integer> primes=new ArrayList<Integer>();
	  for(int i=0;i<primeFlags.length;i++)
		  if(primeFlags[i])primes.add(i);
	  return primes;
  }
  
  /** Given an unmarked boolean[] of flags, serially marks each one saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  /**
   * produces a list of primes from unmarked boolean[]
   * @param primeFlags
   * @return List<Integer>
   */
  public static List<Integer> findPrimesSerial(final boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			markPrimesSerial(primeFlags);
			return "findPrimesSerial";
		}
	});
	 
   return collectPrimes(primeFlags);
  }
  
  /** Uses findPrimesSerial(booleanArray) to produce a List of primes
   *  less than the given size. */
  /**
   * produces a list of primes based from parameter
   * @param size
   * @return List<Integer>
   */
  public static List<Integer> findPrimesSerial(final int size) {
	// To Do : collect and return list of marked prime numbers from given only the size
	  final boolean[] primeFlags=new boolean[size+1];
	  TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			markPrimesSerial(primeFlags);
			return "findPrimesSerial parameter based";
		}
	}); 
	  return collectPrimes(primeFlags);
  }
  
  /** Given an unmarked boolean[] of flags, marks each one in parallel, saying
   *  whether the index is prime or not, then passes that array
   *  to collectPrimes to produce a List of primes. The version where
   *  you pass in the array (here) was split into a separate method so that,
   *  for timing purposes, you can separate the time of making the array
   *  from the time of marking it.
   */
  /**
   * produces a list of primes from unmarked boolean[] paralelly
   * @param primeFlags
   * @return List<Integer>
   */
  public static List<Integer> findPrimesParallel(final boolean[] primeFlags) {
	// To Do : collect and return list of marked prime numbers given the empty boolean array
	  TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			markPrimesParallel(primeFlags);
			return "findPrimesParallel";
		}
	});
	  markPrimesParallel(primeFlags);
	  return collectPrimes(primeFlags);
  }
  
  /** Uses findPrimesParallel(booleanArray) to produce a List of primes
   *  less than the given size. */
  /**
   * produces a list of primes based from parameter paralelly
   * @param size
   * @return List<Integer>
   */
  public static List<Integer> findPrimesParallel(final int size) {
    // To Do : collect and return list of marked prime numbers from given only the size
	  final boolean[] primeFlags=new boolean[size+1];
	  TimingUtils.timeOp(new Op() {
		
		@Override
		public String runOp() {
			markPrimesParallel(primeFlags);
			return "findPrimesParallel parameter based";
		}
	}); 
	  return collectPrimes(primeFlags);
  }
  
}
