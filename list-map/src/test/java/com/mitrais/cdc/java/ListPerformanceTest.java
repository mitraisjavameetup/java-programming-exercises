package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListPerformanceTest {

	private static int numTests = 5;
	
	@Test
	public void test() {
		ListPerformance performance = new ListPerformance();
		int listSize = 100_000;
	    for(int i=0; i<numTests; i++) {
	      List<String> linkedList = new LinkedList<>();
	      List<String> arrayList = new ArrayList<>();
	      for(int j=0; j<listSize; j++) {
	        String value = "Entry " + j;
	        linkedList.add(value);
	        arrayList.add(value);
	      }
	      double linkedResult = performance.timeAccess("Linked list", linkedList);
	     	      double arrayResult = performance.timeAccess("Array  list", arrayList);
	      assertTrue(linkedResult > 0.0);
	      assertTrue(linkedResult > 0.0);
	      listSize = listSize * 2;
	    }
	}

}
