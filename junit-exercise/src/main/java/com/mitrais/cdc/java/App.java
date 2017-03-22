package com.mitrais.cdc.java;

import java.util.Collections;
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
		speech = speech.replaceAll("!","");
	    return(speech);
	  }
	  
	  /** Method calmAttendees: 
	   *  Takes a List of political parties (List of String) and potentially modifies it so
	   *  that it never contains both "Republican" and "Democrat". If it contains
	   *  both, it flips a coin to decide which to remove (half time it remove "Republican"
	   *  and half time it remove "Democrat"
	   *  If it contains neither,or is null, it does nothing.
	   */
	  public static void calmAttendees(List<String> attendingParties) {
			//todo: apply logic as described above
		  if(attendingParties.contains("Republican") && attendingParties.contains("Democrat")){
			  double temp = Math.random();
			  if(temp<0.5) attendingParties.removeAll(Collections.singleton("Republican"));
			  else attendingParties.removeAll(Collections.singleton("Democrat"));
		  }
		  for(int i=0;i<attendingParties.size(); i++){
			  System.out.print(attendingParties.get(i)+" ");
		  }
		  System.out.println();
	  }
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
