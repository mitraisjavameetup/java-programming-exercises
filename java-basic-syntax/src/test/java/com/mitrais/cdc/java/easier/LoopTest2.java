package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LoopTest2 {

	@Test
	public void test_printNums1() {
		List<Integer> intList = LoopTest.printNums1(3);
		assertTrue(intList.size() == 4);
		assertTrue(intList.get(0) == 0);
		assertTrue(intList.get(1) == 1);
		assertTrue(intList.get(2) == 2);
		assertTrue(intList.get(3) == 3);
	}
	
	@Test
	public void test_printNums2() {
		List<Integer> intList = LoopTest.printNums2(7);
		assertTrue(intList.size() == 4);
		assertTrue(intList.get(0) == 0);
		assertFalse(intList.get(1) == 1);
		assertTrue(intList.get(1) == 2);
		assertFalse(intList.get(2) == 2);
		assertTrue(intList.get(2) == 4);
		assertFalse(intList.get(3) == 3);
		assertTrue(intList.get(3) == 6);
	}
	
	@Test
	public void test_printNums3() {
		List<Integer> intList = LoopTest.printNums3(5);
		assertTrue(intList.size() == 6);
		assertTrue(intList.get(0) == 5);
		assertTrue(intList.get(1) == 4);
		assertTrue(intList.get(2) == 3);
		assertTrue(intList.get(3) == 2);
		assertTrue(intList.get(4) == 1);
		assertTrue(intList.get(5) == 0);
	}

}
