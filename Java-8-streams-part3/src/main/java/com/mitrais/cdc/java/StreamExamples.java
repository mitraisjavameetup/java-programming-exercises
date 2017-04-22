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

public class StreamExamples {
	
	int arraySize = 150_000_000;
  
	//TODO
	//Make an “infinite” stream that generates random doubles between 0 and 10. Use it to
	//	• Print 5 random doubles
	//  • Make a List of 10 random doubles
	//  • Make an array of 20 random doubles
	Stream<Double> infiniteStream1 = MathUtils.randomNums(20.0);
	List<Double> listDouble = infiniteStream1.limit(10).collect(Collectors.toList());
	
	Stream<Double> infiniteStream2 = MathUtils.randomNums(10.0);
	Double[] arrayDouble = infiniteStream2.limit(20).toArray(Double[]::new);
	
	public void printRandomDoubles() {
		infiniteStream1.forEach(System.out::println);
		infiniteStream2.forEach(System.out::println);
	}
	
	public double[] getArray(){
		double[] numArray = MathUtils.randomArray(arraySize);
		return numArray;
	}
	
	public double timeSumSequential(DoubleStream numStream) {
		double time = 0;
	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSum
	   * then stored to variable time
	   */
		
		return Op.timeOp(() -> {
			double sum = MathUtils.sqrtSum(numStream);
			System.out.printf("Sum is %,.8f.%n", sum);
		});
	}

	public double timeSumParallel(DoubleStream numStream) {
		double time = 0;
	  /* TO DO
	   * using lambda expression
	   * call method/function to count the elapsed time on Op.java
	   * with operation is sqrtSumParallel
	   * then stored to variable time
	   */
		
		return Op.timeOp(() -> {
			double sum = MathUtils.sqrtSumParallel(numStream);
			System.out.printf("Sum is %,.8f.%n", sum);
		});
	} 
}