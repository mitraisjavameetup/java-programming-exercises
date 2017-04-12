package com.mitrais.cdc.java;

import java.util.*;
import java.util.stream.*;

/** TO DO 
 *  - You will generate very large array of random doubles 
 *  arraySize: 100_000_000
 *  (you can use randomArray method on MathUtils.java)
 *  - Compute the sum of the square roots of the numbers in the array 
 *  Find a shorter and simpler way than making a loop to tally the sum
 *  (You could use available method sqrtSum and sqrtSumParallel on MathUtils.java) 
 *  - Test whether the parallel approach is faster than the sequential approach
 *  using timeOp method on Op.java
 */
/**
 * 
 * @author trainee
 * class StreamExamples
 */
public class StreamExamples {
	
	int arraySize = 1_000_000;
	

	/**
	 * 
	 * @return double[]
	 */
	public double[] getArray(){
		double[] numArray = MathUtils.randomArray(arraySize);
		return numArray;
	}
	/**
	 * 
	 * @param numStream
	 * @return double
	 */
	public double timeSumSequential(DoubleStream numStream) {
		double time = 0;
	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSum
	   * then stored to variable time
	   */
		Op serialSum= () ->{
		double sum=MathUtils.sqrtSum(numStream);
		System.out.printf("serial sum: %f.%n",sum);
		};
		time=Op.timeOp(serialSum);
		return time;
	}
	/**
	 * 
	 * @param numStream
	 * @return double
	 */
	public double timeSumParallel(DoubleStream numStream) {
		double time = 0;
	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSumParallel
	   * then stored to variable time
	   */
		Op serialSum= () ->{
			double sum=MathUtils.sqrtSum(numStream);
			System.out.printf("parallel sum: %f.%n",sum);
			};
		time=Op.timeOp(serialSum);
		return time;
	}
  
}
