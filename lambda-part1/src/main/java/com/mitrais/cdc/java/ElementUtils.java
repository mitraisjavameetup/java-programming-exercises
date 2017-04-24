package com.mitrais.cdc.java;


/** Method that uses the generic TwoElementPredicate, rather than the
 *  String-specific TwoStringPredicate.
 */

public class ElementUtils {
  public static <T> T betterElement(T element1, T element2, TwoElementPredicate<T> tester) {
    
	/*
	 * TO DO
	 * Define the static method betterElement. 
	 * That method will take 2 Generic Element <T> and an instance of your interface.
	 * It returns element1 if the method in interface returns true, element2 otherwise. 
	 * This method is normal Java 7 code.
	 */	
	  if (tester.isBetter(element1, element2)==true)
	  {
		  return element1;
	  }
	  else
	  {
		  return element2;
	  }
	
  }
  
  private ElementUtils() {}
}
