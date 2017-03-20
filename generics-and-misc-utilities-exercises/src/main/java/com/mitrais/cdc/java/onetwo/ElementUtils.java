package com.mitrais.cdc.java.onetwo;

import java.util.*;

/** Two generically typed static methods: one to return
 *  the last element of a List, and another to return
 *  the last element of an array.
 *  @author Egi
 *  @version 1.0
 */
public class ElementUtils {
  
  // Really should synchronize in case size changes between
  // the check of the size and the lookup, but we have not
  // yet covered synchronization. Also, instead of sometimes 
  // returning null, it would make more sense to return an 
  // Optional<T>, but we haven't covered Optional yet either.
  
  /**
   * Will return the last element of the list
   * @param elements
   * @return lastEntry
   */
  public static <T> T lastElement(List<T> elements) {
	//TODO: Trainee should modify this method to return last element of List  
    return(elements.get(elements.size() - 1));
  }
  
  /**
   * Will return the last element of an array
   * @param elements
   * @return
   */
  public static <T> T lastElement(T[] elements) {
	//TODO: Trainee should modify this method to return last element of Array
    return(elements[elements.length - 1]);
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
