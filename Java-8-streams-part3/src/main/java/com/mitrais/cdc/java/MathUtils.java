package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.*;

/** NOTE
 * This is helper class
 * Please use the method from here to answer the problems
 */
/**
 * 
 * @author trainee
 * class MathUtils
 */
public class MathUtils {
  /** Produces an array containing size doubles, each between 0 and 1.
   */
	/**
	 * 
	 * @param size
	 * @return double[]
	 */
  public static double[] randomArray(long size) {
	 double[] result=new Random().doubles(size).toArray();
    //todo:
    // Make a very large array of random doubles, each of which ranges from 0 to 1. A quick and easy
    //way to do this is with “new Random().doubles(size).toArray()”.
    return result;
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Serial version.
   */
  /**
   * 
   * @param numStream
   * @return double
   */
  public static double sqrtSum(DoubleStream numStream) {
    // TODO:
    //Compute the sum of the square roots of the numbers in the array. Find a shorter and simpler way
    //than making a loop to tally the sum
	double result= numStream.map(d->Math.sqrt(d)).sum(); 
    return result;
  }
  
  /** Returns the sum of the square roots of entries in the stream. 
   *  Parallel version.
   */
  /**
   * 
   * @param numStream
   * @return double
   */
  public static double sqrtSumParallel(DoubleStream numStream) {
    // TODO:
    //Repeat the process at sqrtSum method in parallel
	double result=numStream.parallel().map(d->Math.sqrt(d)).sum();  
    return result;
  }
  
  // Or, use DoubleStream.generate, which produces DoubleStream
  // instead of Stream<Double>
  /**
   * 
   * @param maxValue
   * @return Stream<Double>
   */
  /**
   * 
   * @param maxValue
   * @return Stream<Double>
   */
  public static Stream<Double> randomNums(double maxValue) {
		//TODO
		//Make an “infinite” stream that generates random doubles between 0 and 10. Use it to
		//	• Print 5 random doubles
		//  • Make a List of 10 random doubles
		//  • Make an array of 20 random doubles
	  Stream<Double> stream=Stream.generate(()->Math.random()*maxValue);
	 List<Double> list=stream.limit(10).collect(Collectors.toList());
	 Double[] arr=Stream.generate(Math::random).limit(20).toArray(size->new Double[size]);
	 stream.limit(5).forEach(System.out::println);
    return stream;
  }
}
