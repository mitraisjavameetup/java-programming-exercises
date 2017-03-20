package com.mitrais.cdc.java.resources;


public class SalesTest {
  public static void main(String[] args) {
    CarSale sale1 = new CarSale("Lamborghini Aventador", 400_000, 5);
    CarSale sale2 = new CarSale("Ferrari 458 Spider", 300_000, 4);
    PaperclipSale sale3 = new PaperclipSale("silver", 1.55, 3_000);
    PaperclipSale sale4 = new PaperclipSale("gold", 2.56, 2_000);
    Sellable[] sales = { sale1, sale2, sale3, sale4 };
    System.out.println("Items for sale:");
    for(Sellable sale: sales) {
      System.out.println("  " + sale);
    }
    System.out.println("Cheapest item: " + Sellable.cheapest(sales));
    System.out.println("Total cost: " + Sellable.totalCost(sales));
  }
}
