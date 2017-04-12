package com.mitrais.cdc.java;

import java.util.*;
import java.util.function.Supplier;
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
	double total = numStream.map(Math::sqrt).sum();
    return total;
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Parallel version.
   */
  public static double sqrtSumParallel(DoubleStream numStream) {
    // TODO:
    //Repeat the process at sqrtSum method in parallel
	double total = numStream.map(Math::sqrt).parallel().sum();
    return total;
  }
  
  // Or, use DoubleStream.generate, which produces DoubleStream
  // instead of Stream<Double>
  public static Stream<Double> randomNums(double maxValue) {
    //todo
	Supplier<Double> random = () -> Math.random()*10;
    return Stream.generate(random).limit((long)maxValue);
  }
}
