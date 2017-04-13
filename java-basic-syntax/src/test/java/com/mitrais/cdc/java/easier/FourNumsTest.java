package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FourNumsTest {

	@Test
	public void test() {
		List<Double> list = FourNums.fourNums();
		assertTrue(list.size() > 0);
		assertTrue(list.get(0).getClass().equals(Double.class));
	}

}
