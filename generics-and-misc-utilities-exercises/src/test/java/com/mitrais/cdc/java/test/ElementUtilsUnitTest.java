package com.mitrais.cdc.java.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mitrais.cdc.java.onetwo.ElementUtils;
import com.mitrais.cdc.java.shapes.Circle;

public class ElementUtilsUnitTest {
	@Test
	public void test() {
		//String
		String[] names1 = {"John", "Juan", "Jane", "Tarzan"};
	    List<String> names2 = Arrays.asList(names1);
	    
	    assertEquals("Tarzan", ElementUtils.lastElement(names2));
	    assertEquals("Tarzan", ElementUtils.lastElement(names1));
	    
	    
	    //Integer
	    Integer[] int1 = {2, 5, 31, 92, 7};
	    List<Integer> int2 = Arrays.asList(int1);
	    
	    assertEquals(7, ElementUtils.lastElement(int1), 0);
	    assertEquals(7, ElementUtils.lastElement(int2), 0);
	    
	    
	    //Circle
	    Circle[] circle1 = {new Circle(2), new Circle(5), new Circle(31), new Circle(92), new Circle(7)};
	    List<Circle> circle2 = Arrays.asList(circle1);
	    
	    assertEquals(7, ElementUtils.lastElement(circle1).getRadius(), 0);
	    assertEquals(7, ElementUtils.lastElement(circle2).getRadius(), 0);
	}
}
