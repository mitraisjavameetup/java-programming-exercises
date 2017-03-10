package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ElemetnUtilsTests {
	String[] names1 = {"John", "Juan", "Jane"};
	List<String> names2 = Arrays.asList(names1);

	@Test
	public void testLastElementListOfT() {
		String lastName = ElementUtils.lastElement(names2);
		assertTrue(lastName.equals("Jane"));
	}

	@Test
	public void testLastElementTArray() {
		String lastName = ElementUtils.lastElement(names1);
		assertTrue(lastName.equals("Jane"));
		
		Integer[] nums = { 1, 2, 3};
		Integer lastNum = ElementUtils.lastElement(nums);
		assertTrue(lastNum == 3);
		assertFalse(lastNum == 1);
		assertFalse(lastNum == 2);
	    
	}

}
