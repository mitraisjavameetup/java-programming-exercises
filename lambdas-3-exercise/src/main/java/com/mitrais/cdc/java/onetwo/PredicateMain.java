package com.mitrais.cdc.java.onetwo;

import java.util.*;

import com.mitrais.cdc.java.ElementUtils;
import com.mitrais.cdc.java.StringUtils;

public class PredicateMain {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
    System.out.printf("Original words: %s.%n", words);
    
    ///////To test Question 1
    List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
    System.out.printf("Short words: %s.%n", shortWords);

    List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
    System.out.printf("B words: %s.%n", wordsWithB);

    List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
    System.out.printf("Even-length words: %s.%n", evenLengthWords);

    //////To test Question 2
    List<String> shortWords2 = ElementUtils.allMatches(words, s -> s.length() < 4);
    System.out.printf("Short words: %s.%n", shortWords2);
    
    List<String> wordsWithB2 = ElementUtils.allMatches(words, s -> s.contains("b"));
    System.out.printf("B words: %s.%n", wordsWithB2);
    
    List<String> evenLengthWords2 = ElementUtils.allMatches(words, s -> (s.length() % 2) == 0);
    System.out.printf("Even-length words: %s.%n", evenLengthWords2);
    
    List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
    List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n>500);
    System.out.printf("Nums bigger than 500: %s.%n", bigNums);
  }
}
