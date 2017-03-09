package com.mitrais.cdc.java.three;

public class TwoItemsMain {
	public static void main(String[] args) {
		//TODO: fix class TwoItems so the errors here is solved
		
		TwoItems<String> twoNames = new TwoItems<>("John", "Jane");
		System.out.printf("twoNames=%s.%n", twoNames);
		String name1 = twoNames.getItem1(); // Value is "John"
		String name2 = twoNames.getItem2(); // Value is "Jane"
		System.out.printf(" First item: %s.%n", name1);
		System.out.printf(" Second item: %s.%n", name2);
		
		TwoItems<Integer> twoNums = new TwoItems<>(5, 7);
		System.out.printf("twoNums=%s.%n", twoNums);
		Integer num1 = twoNums.getItem1(); // Value is 4
		Integer num2 = twoNums.getItem2(); // Value is 7
		System.out.printf(" First item: %s.%n", num1);
		System.out.printf(" Second item: %s.%n", num2);
	}
}
