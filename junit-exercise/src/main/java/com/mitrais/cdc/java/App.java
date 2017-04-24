package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

/**
 * There are 2 method below
 * Please create the test case using junit on src/test/java/AppTest.java
 * to unit testing each method
 */
public class App {

	  /** Method calmString:
	   *  Takes a String and returns a new String with all the exclamation points
	   *  removed. For example, Utils.calmString("!foo!!") should return "foo".
	   */
	  public static String calmString(String speech) {
		//todo: apply logic as described above
		speech=speech.replaceAll("!", "");
		
	    return(speech);
	  }
	  
	  /** Method calmAttendees: 
	   *  Takes a List of political parties (List of String) and potentially modifies it so
	   *  that it never contains both "Republican" and "Democrat". If it contains
	   *  both, it flips a coin to decide which to remove (half time it remove "Republican"
	   *  and half time it remove "Democrat"
	   *  If it contains neither,or is null, it does nothing.
	   */
	  public static List<String> calmAttendees(List<String> attendingParties) {
			//todo: apply logic as described above
		
		 List<String> tampung= new ArrayList<String>();
		 
		 for (String temp:attendingParties)
		 {
			if (temp.contains("Democrat") && temp.contains("Republican"))
			{
				if(Math.random()<0.5)
				{
					temp=temp.replaceAll("Democrat ", "");
				}
				else
				{
					temp=temp.replaceAll("Republican ", "");
				}
			}
			tampung.add(temp);
		 }
		
		 return tampung;
		 
		 
	  }
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
