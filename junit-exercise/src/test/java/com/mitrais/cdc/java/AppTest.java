package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.core.IsEqual;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testCalmString() {
		/*
		 * todo: Please create jUnit code to test calmString method on App.java
		 * at least create 4 test cases using 'assertThat' (modern approach) and
		 * 4 test cases using 'assertEquals' (traditional approach)
		 */
		assertThat("foo", is(App.calmString("foo!")));
		assertThat("", is(App.calmString("!")));
		assertThat("gogogo", is(App.calmString("gogogo!")));
		assertThat("wow", is(App.calmString("wow!")));

		assertEquals("waw", App.calmString("waw!"));
		assertEquals("bib", App.calmString("bib!"));
		assertEquals("blop", App.calmString("blop!"));
		assertEquals("uwaw", App.calmString("uwaw!"));

	}

	public void testCalmAttendees() {
		/*
		 * todo: Please create jUnit code using modern approach to test
		 * calmAttendees method on App.java at least create 3 test case using
		 * 'assertThat'
		 */
		List<String> attendingParties = new ArrayList<String>();
		attendingParties.add("Republican");
		attendingParties.add("Democrat");
		attendingParties.add("RepublicanDemocrat");
		
		List<String> attendingParties2 = new ArrayList<String>();
		attendingParties2.add("RepublicanDemocrat");
		attendingParties2.add("Democrat");
		attendingParties2.add("RepublicanDemocrat");
		
		List<String> attendingParties3 = new ArrayList<String>();
		attendingParties3.add("RepublicanDemocrat");
		attendingParties3.add("RepublicanDemocrat");
		attendingParties3.add("RepublicanDemocrat");
		
		App.calmAttendees(attendingParties);
		App.calmAttendees(attendingParties2);
		App.calmAttendees(attendingParties3);

		assertThat(2, is(attendingParties.size()));
		assertThat(1, is(attendingParties2.size()));
		assertThat(0, is(attendingParties3.size()));

	}
}
