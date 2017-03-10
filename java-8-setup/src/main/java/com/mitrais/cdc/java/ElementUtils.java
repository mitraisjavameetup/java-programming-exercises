package com.mitrais.cdc.java;

import java.util.*;

public class ElementUtils {
  /* To Do :
   * Make a static method called “lastEntry” to which you pass a List and get back the last entry of
   * that list. If you pass it a List of Strings, you should get back a String. If you pass it a List of
   * Circles, you should get back a Circle. E.g.:
   * List<Circle> listOfCircles = ...;
   * Circle lastCircle = ListUtils.lastEntry(listOfCircles);
   * For simplicity, test it with Strings, but be sure you do not do any typecasts in the code that
   * calls your method.
   */
  
  public static <T> T lastElement(List<T> elements) {
	  return null;
  }
  
  /* To Do :
   * Next, support arrays as well as Lists. That is, you should be able to call either 
   * ListUtils.lastEntry(someList) or ListUtils.lastEntry(someArray). 
   * Hint: very easy once you think of a minor trick.
   */
  public static <T> T lastElement(T[] elements) {
      return null;
  }
  
  private ElementUtils() {} // Uninstantiatable class
}
