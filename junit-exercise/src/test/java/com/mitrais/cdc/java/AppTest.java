package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	/**
	 * Unit test for Method CalmString
	 */
	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		assertEquals("foo",App.calmString("!foo!!!!"));
		assertEquals("foo",App.calmString("!!foo!!"));
		assertEquals("foo",App.calmString("foo!!"));
		assertEquals("foo",App.calmString("!!!foo"));
		
		assertThat("foo", is(equalTo(App.calmString("!!foo"))));
		assertThat("foo", is(equalTo(App.calmString("!!foo!!!"))));
		assertThat("foo", is(equalTo(App.calmString("!!!foo"))));
		assertThat("foo", is(equalTo(App.calmString("foo!!"))));
    }
	/**
	 * Unit test for Method CalmAttendees
	 */
	@Test
	public void testCalmAttendees()
    {
		List<String> attendingParties = new ArrayList<String>();
		attendingParties.add("Republican");
		attendingParties.add("Democrat");
		attendingParties.add("PDIP");
		attendingParties.add("Golkar");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Republican");
		list1.add("PDIP");
		list1.add("GOLKAR");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("PPP");
		list2.add("PDIP");
		list2.add("GOLKAR");
		
		/* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		App.calmAttendees(attendingParties);
		assertThat(3, is(attendingParties.size()));
		
		App.calmAttendees(list1);
		assertThat(2, is(list1.size()));
		
		App.calmAttendees(list2);
		assertThat(3, is(list2.size()));
		
    }
}
