package com.mitrais.cdc.java.one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStream{
	
	private static <T> void printStream(Stream<T> s, String message){
		System.out.printf("%s: %s.%n", message, s.collect(Collectors.toList()));
	}
	
	public static void mapExamples(){
		List<Double> nums = Arrays.asList(1.0,2.0,3.0,4.0,5.0);
		printStream(nums.stream(),"Original nums");
		printStream(nums.stream().map(n-> n * n).filter(n -> n > 3),"Square with result greater than 3");
		printStream(nums.stream().map(n->n * n).map(Math::sqrt),"Square root of the squares");
		
		Integer[] ids = { 1,2,4,8};
		printStream(Stream.of(ids), "IDs");
	}
	
	public static void main(String[] args) {
		mapExamples();
	}
}