package com.mitrais.cdc.java;

import java.awt.Color;



public class ColorPanelTest{
	@Test
	public void colorPanel1Test(){
		ColorPanel1 cp1= new ColorPanel1();
		assertEquals(cp1.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel2Test(){
		ColorPanel1 cp2= new ColorPanel1();
		assertEquals(cp2.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel3Test(){
		ColorPanel1 cp3= new ColorPanel1();
		assertEquals(cp3.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel4Test(){
		ColorPanel1 cp4= new ColorPanel1();
		assertEquals(cp4.getBackground(), Color.RED);
	}
	@Test
	public void colorPanel5Test(){
		ColorPanel1 cp5= new ColorPanel1();
		assertEquals(cp5.getBackground(), Color.RED);
	}
}
