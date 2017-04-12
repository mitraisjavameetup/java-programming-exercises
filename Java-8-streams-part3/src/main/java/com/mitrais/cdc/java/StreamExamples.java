package com.mitrais.cdc.java;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
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

public class StreamExamples {
	
	int arraySize = 1_000_000;
	
	public StreamExamples() {
		System.out.println("5 random numbers: ");
		MathUtils.randomNums(5).forEach(a -> System.out.println(a));
		Random r = new Random();
		DoubleStream doubleStream = r.doubles(0, 10);
		List<Double> ten = doubleStream.limit(10).boxed().collect(Collectors.toList());
		System.out.println("\n 10 random numbers (list): " + ten);
		Double[] twenty = MathUtils.randomNums(20).toArray(a -> new Double[a]);
		System.out.println("\n 20 random numbers (array): " + Arrays.asList(twenty));
	}
	
	//TODO
	//Make an “infinite” stream that generates random doubles between 0 and 10. Use it to
	//	• Print 5 random doubles
	//  • Make a List of 10 random doubles
	//  • Make an array of 20 random doubles


	public double[] getArray(){
		double[] numArray = MathUtils.randomArray(arraySize);
		return numArray;
	}
	
	public double timeSumSequential(DoubleStream numStream) {
		double time = Op.timeOp(() -> {
			double sum = MathUtils.sqrtSum(numStream);
			System.out.printf("\n Sum is %,.8f.%n", sum);
			});

	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSum
	   * then stored to variable time
	   */
		return time;
	}
  
	public double timeSumParallel(DoubleStream numStream) {
		double time = Op.timeOp(() -> {
			double sum = MathUtils.sqrtSumParallel(numStream);
			System.out.printf("\n Sum is %,.8f.%n", sum);
			});

	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSumParallel
	   * then stored to variable time
	   */
		return time;
	}
  
}
