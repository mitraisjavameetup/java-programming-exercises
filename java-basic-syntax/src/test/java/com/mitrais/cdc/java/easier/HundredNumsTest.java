package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import org.junit.Test;

public class HundredNumsTest {

	@Test
	public void test_runHundredNums() {
		double result = HundredNums.runHundredNums(100);
		assertFalse(result == 0.0);
		assertTrue(result > 60);
	}

}
