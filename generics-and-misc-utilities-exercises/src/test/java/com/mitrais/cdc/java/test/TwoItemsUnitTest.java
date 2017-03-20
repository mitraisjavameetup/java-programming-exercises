package com.mitrais.cdc.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mitrais.cdc.java.three.TwoItems;

public class TwoItemsUnitTest {
	@Test
	public void test(){
		TwoItems<String> twoNames = new TwoItems<>("John", "Jane");
		TwoItems<String> twoNames2 = new TwoItems<>("John", "Jane");
		String name1 = twoNames.getItem1();
		String name2 = twoNames.getItem2();
		assertEquals("John", name1);
		assertEquals("Jane", name2);
		assertEquals(twoNames.toString(), twoNames2.toString());
		
		TwoItems<Integer> twoNums = new TwoItems<>(5, 7);
		TwoItems<Integer> twoNums2 = new TwoItems<>(5, 7);
		Integer num1 = twoNums.getItem1();
		Integer num2 = twoNums.getItem2();
		assertEquals(5, num1, 0);
		assertEquals(7, num2, 0);
		assertEquals(twoNums.toString(), twoNums2.toString());
	}
}
