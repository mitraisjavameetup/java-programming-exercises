package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.*;

/** NOTE
 * This is helper class
 * Please use the method from here to answer the problems
 */
public class MathUtils {
  /** Produces an array containing size doubles, each between 0 and 1.
   */
  public static double[] randomArray(long size) {
    //todo:
    // Make a very large array of random doubles, each of which ranges from 0 to 1. A quick and easy
    //way to do this is with “new Random().doubles(size).toArray()”.
	  
    return new Random().doubles(size).toArray();
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Serial version.
   */
  public static double sqrtSum(DoubleStream numStream) {
    // TODO:
    //Compute the sum of the square roots of the numbers in the array. Find a shorter and simpler way
    //than making a loop to tally the sum
	  
    return numStream.map(d -> Math.sqrt(d)).sum();
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Parallel version.
   */
  public static double sqrtSumParallel(DoubleStream numStream) {
    // TODO:
    //Repeat the process at sqrtSum method in parallel
	  return numStream.parallel().map(d -> Math.sqrt(d)).sum();
  }
  
  // Or, use DoubleStream.generate, which produces DoubleStream
  // instead of Stream<Double>
  public static Stream<Double> randomNums(double maxValue) {
    //todo
	  //infinite stream
	 return DoubleStream.generate(() -> Math.random()*maxValue).boxed();
  }
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Random 10 Double List:");
		List<Double> randList = randomNums(10).limit(10).collect(Collectors.toList());
		randList.stream().forEach(r -> System.out.println(r));
		
		System.out.println("Random 5 Double Array :");
		Double[] randArr = randomNums(10).limit(5).toArray(Double[]::new);
		for(Double r:randArr)
			System.out.println(r);
		
		System.out.println("Random 20 Double Array :");
		Double[] randArr20 = randomNums(10).limit(20).toArray(Double[]::new);
		for(Double r20:randArr20)
			System.out.println(r20);
	}
}
