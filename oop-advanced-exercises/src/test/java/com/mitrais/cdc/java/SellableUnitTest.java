package com.mitrais.cdc.java;

import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.mitrais.cdc.java.resources.*;


public class SellableUnitTest {
	
	@Test
	public void test() {
		CarSale sale1 = new CarSale("Lamborghini Aventador", 400_000, 5);
	    CarSale sale2 = new CarSale("Ferrari 458 Spider", 300_000, 4);
	    PaperclipSale sale3 = new PaperclipSale("silver", 1.55, 3_000);
	    PaperclipSale sale4 = new PaperclipSale("gold", 2.56, 2_000);
	    Sellable[] sales = { sale1, sale2, sale3, sale4 };
	    
	    Sellable cheapest = Sellable.cheapest(sales);
	    double totalCost = Sellable.totalCost(sales);
	    
	    assertNotNull(sale1);
		assertEquals(380_000, sale1.getCost(),  0);
		
		assertNotNull(sale3);
		assertEquals(4_650, sale3.getCost(), 0);
	    
	    assertEquals(sale3, cheapest);
	    assertEquals(677770, totalCost, 0);
	    
	    
	}
	
}
