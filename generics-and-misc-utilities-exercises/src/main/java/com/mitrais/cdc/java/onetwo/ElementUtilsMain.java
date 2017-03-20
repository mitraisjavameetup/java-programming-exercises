package com.mitrais.cdc.java.onetwo;

import java.util.*;

/**
 * Main class for Element Utils
 * @author Egi
 * @version 1.0
 */
public class ElementUtilsMain {
  /**
   * Main static method for ElementUtilsMain
   * @param args
   */
  public static void main(String[] args) {
    String[] names1 = {"John", "Juan", "Jane"};
    List<String> names2 = Arrays.asList(names1);
    
    System.out.printf("Using List method, last element is %s.%n", ElementUtils.lastElement(names2));
    System.out.printf("Using array method, last element is %s.%n", ElementUtils.lastElement(names1));
  }

}
