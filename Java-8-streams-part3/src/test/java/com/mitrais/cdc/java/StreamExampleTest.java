package com.mitrais.cdc.java;

import static org.junit.Assert.assertTrue;

import java.util.stream.DoubleStream;

import org.junit.Test;

public class StreamExampleTest {
	 
	@Test
	public void StreamTest(){
		StreamExamples SE = new StreamExamples();
		double[] arrNum = SE.getArray();
		assertTrue(SE.timeSumParallel(DoubleStream.of(arrNum))>0);
		assertTrue(SE.timeSumSequential(DoubleStream.of(arrNum))> 0);
	}
}
