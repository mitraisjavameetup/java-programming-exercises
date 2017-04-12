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
	  double[] large = new Random().doubles(size).toArray();
    //todo:
    // Make a very large array of random doubles, each of which ranges from 0 to 1. A quick and easy
    //way to do this is with “new Random().doubles(size).toArray()”.
    return large;
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Serial version.
   */
  public static double sqrtSum(DoubleStream numStream) {
	  double sqrt = numStream.map(Math::sqrt).sum();
	  
	// TODO:
    //Compute the sum of the square roots of the numbers in the array. Find a shorter and simpler way
    //than making a loop to tally the sum

    return sqrt;
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Parallel version.
   */
  public static double sqrtSumParallel(DoubleStream numStream) {
	  double sqrt = numStream.map(Math::sqrt).parallel().sum();
    // TODO:
    //Repeat the process at sqrtSum method in parallel

    return sqrt;
  }
  
  // Or, use DoubleStream.generate, which produces DoubleStream
  // instead of Stream<Double>
  public static Stream<Double> randomNums(double maxValue) {
    
	  Stream<Double> randomNums = DoubleStream.generate(()->(Math.random()*10)).boxed().limit((long) maxValue);
	  
	  //todo
    return randomNums;
  }
}
