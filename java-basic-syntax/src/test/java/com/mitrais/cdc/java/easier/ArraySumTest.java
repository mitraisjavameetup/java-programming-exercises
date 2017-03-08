package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class ArraySumTest {
	
	 double[] numbers = { 1.1, 2.2, 3.3 };
	 double[] moreNumbers = { 1.1, 2.2, 3.3, -1, -2, 4 };

	@Test
	public void test_arraySum1() {
		double num = ArraySum.arraySum1(numbers);
		assertFalse(num == 0.0);
		assertTrue(num == 6.6);
	}
	
	@Test
	public void test_arraySum2() {
		double num = ArraySum.arraySum2(numbers);
		assertFalse(num == 0.0);
		assertTrue(num == 6.6);
	}
	
	@Test
	public void test_arraySum3() {
		double num = ArraySum.arraySum3(numbers);
		assertFalse(num == 0.0);
		assertTrue(num == 6.6);
	}
	
	@Test
	public void test_arraySum4() {
		double num = ArraySum.arraySum4(numbers);
		assertFalse(num == 0.0);
		assertTrue(num == 6.6);
	}

	@Test
	public void test_arrayAverage() {
		DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
		double num = ArraySum.arrayAverage(numbers);
		assertFalse(num == 0.0);
		assertTrue(oneDigit.format(num).equals("2.2"));
	}
	
	@Test
	public void test_numPositive() {
		double num = ArraySum.numPositive(moreNumbers);
		assertFalse(num < 0);
		assertTrue(num == 4);
	}
	
	@Test
	public void test_numInRange() {
		int num = ArraySum.numInRange(moreNumbers, 1.0, 3.2);
		assertFalse(num < 0);
		assertTrue(num == 2);
	}
}
