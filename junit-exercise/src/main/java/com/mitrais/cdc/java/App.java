package com.mitrais.cdc.java;

import java.util.List;

/**
 * There are 2 method below
 * Please create the test case using junit on src/test/java/AppTest.java
 * to unit testing each method
 */
public class App {
		
	  /** Remove all exclamation points in the String
	   */
	
	  public static String calmString(String speech) {
		//todo: apply logic as described above
		speech = speech.replaceAll("!","");
	    return(speech);
	  }
	  
	  /** Remove one member of list that contain "Republican" and "Democrat"
	   */
	  public static void calmAttendees(List<String> attendingParties) {
		  //todo: apply logic as described above
		  boolean rep = false, dem = false; 
		  for(String x:attendingParties){
			  if(x == "Republican"){
				  rep = true;
			  }
			  else{
				  if(x == "Democrat"){
					  dem = true;
				  }
			  }
		  }
		  
		  if(rep && dem){
			  if(Math.random()<0.5){
				  attendingParties.remove("Republican");
			  }
			  else{
				  attendingParties.remove("Democrat");
			  }
		  }
		  
	  }
	  
	  private App() {} // Class cannot be instantiated: only static methods
	}
