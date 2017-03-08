package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleListTest {

	@Test
	public void test() {
		CircleList list = new CircleList();
		double listResult = list.runCircleList();
		assertNotNull(listResult);
		assertTrue(listResult != 0);
		assertTrue(listResult > 0.01);
	}

}
