package com.mitrais.cdc.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		String[] testString = {"foo", "foo!", "f!oo", "f!o!o!"};
		for(String s: testString){
			assertThat(App.calmString(s), is(equalTo("foo")));
			assertEquals("foo", App.calmString(s));
		}
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		String[] testString = {"attendee1 Democrat", 
							"attendee2 Republican", 
							"attendee3 Republican", 
							"attendee4", 
							"attende5 Democrat"};
		String[] testString2 = {"attendee1 Democrat", 
				"attendee2 Democrat", 
				"attendee3 Republican", 
				"attendee4", 
				"attende5 Democrat"};
		String[] testString3 = {"attendee1 Democrat", 
				"attendee2 Democrat", 
				"attendee3 Democrat", 
				"attendee4", 
				"attende5 Democrat"};
		List<String> testList = new ArrayList<String>();
		for(String s: testString){
			testList.add(s);
		}
		App.calmAttendees(testList);
		boolean contain1 = false;
		boolean contain2 = false;
		boolean both = false;
		for(String s: testList){
			if(s.contains("Democrat"))
				contain1 = true;
			else if(s.contains("Republican"))
				contain2 = true;
			if(contain1 && contain2)
				both = true;
				break;
		}
		assertThat(true, not(both));
    }
}
