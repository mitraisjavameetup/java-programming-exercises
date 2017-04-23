package com.mitrais.cdc.java.onetwo;

import java.util.*;

/** Two generically typed static methods: one to return
 *  the last element of a List, and another to return
 *  the last element of an array.
 */
public class ElementUtils {
  
  // Really should synchronize in case size changes between
  // the check of the size and the lookup, but we have not
  // yet covered synchronization. Also, instead of sometimes 
  // returning null, it would make more sense to return an 
  // Optional<T>, but we haven't covered Optional yet either.
  
  public static <T> T lastElement(List<T> elements) {
	//TODO: Trainee should modify this method to return last element of List
    return(elements.get(elements.size()-1));
  }
  
  public static <T> T lastElement(T[] elements) {
	//TODO: Trainee should modify this method to return last element of Array
    return(elements[elements.length-1]);
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
