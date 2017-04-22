package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class ColorPanelTest{
	@Test
	public void colorPanel1Test(){
		ColorPanel1 cp1= new ColorPanel1();
		assertEquals(cp1.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel2Test(){
		ColorPanel2 cp2= new ColorPanel2();
		assertEquals(cp2.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel3Test(){
		ColorPanel3 cp3= new ColorPanel3();
		assertEquals(cp3.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel4Test(){
		ColorPanel4 cp4= new ColorPanel4();
		assertEquals(cp4.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel5Test(){
		ColorPanel5 cp5= new ColorPanel5();
		assertEquals(cp5.getBackground(), Color.RED);
	}
	
	@Test
	public void colorPanel6Test(){
		ColorPanel6 cp6= new ColorPanel6();
		assertEquals(cp6.getBackground(), Color.RED);
	}
}
