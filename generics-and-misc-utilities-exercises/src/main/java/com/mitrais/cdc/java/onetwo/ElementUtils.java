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
  /**
   * Will return last of element list
   * @param elements T
   * @return list
   * @param T T
   */
  public static <T> T lastElement(List<T> elements) {
	//TODO: Trainee should modify this method to return last element of List
	  T last=null;
	  for(T list : elements){
		  last = list;
	  }
    return last;
  }
  /**
   * Will return last of element array
   * @param elements T
   * @return array
   * * @param T T
   */
  public static <T> T lastElement(T[] elements) {
	//TODO: Trainee should modify this method to return last element of Array
	  T last=null;
	  for(T array : elements){
		  last = array;
	  }
    return last;
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
