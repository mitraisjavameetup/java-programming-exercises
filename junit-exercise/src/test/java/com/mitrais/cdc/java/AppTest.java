package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;
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
		assertThat("thisiscalm", is(equalTo(App.calmString("thisiscalm!!"))));
		assertThat("thisiscalm", is(equalTo(App.calmString("this!!iscalm!!"))));
		assertThat("thisiscalm", is(equalTo(App.calmString("!thisiscalm!!"))));
		assertThat("thisiscalm", is(equalTo(App.calmString("!!!!!thisiscalm"))));
		assertThat("thisiscalm", is(equalTo(App.calmString("!!this!!iscalm!!"))));
		assertEquals("Test", "thisiscalm", App.calmString("thisiscalm!!"));
		assertEquals("Test", "thisiscalm", App.calmString("this!!iscalm!!"));
		assertEquals("Test", "thisiscalm", App.calmString("!thisiscalm!!"));
		assertEquals("Test", "thisiscalm", App.calmString("!!!!!thisiscalm"));
		assertEquals("Test", "thisiscalm", App.calmString("!!this!!iscalm!!"));
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		boolean check;
		
		List<String> parties1 = new ArrayList<String>();
		parties1.add("Republican");
		parties1.add("Random Party 1");
		parties1.add("Random Party 2");
		App.calmAttendees(parties1);
		
		check = parties1.contains("Republican") ^ parties1.contains("Democrat");
		assertThat(true, is(equalTo(check)));
		
		List<String> parties2 = new ArrayList<String>();
		parties2.add("Republican");
		parties2.add("Democrat");
		App.calmAttendees(parties2);
		
		check = parties2.contains("Republican") ^ parties2.contains("Democrat");
		assertThat(true, is(equalTo(check)));
		
		List<String> parties3 = new ArrayList<String>();
		parties3.add("Republican");
		parties3.add("Republican");
		App.calmAttendees(parties2);
		
		check = parties3.contains("Republican") ^ parties3.contains("Democrat");
		assertThat(true, is(equalTo(check)));
    }
}
