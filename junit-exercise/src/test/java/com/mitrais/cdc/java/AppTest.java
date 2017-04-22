package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

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

		assertThat("foo", is(equalTo(App.calmString("!!!foo!!"))));
		assertThat("ahiyak", is(equalTo(App.calmString("!!!ah!iyak!!"))));
		assertThat("uwaa", is(equalTo(App.calmString("!!!uw!aa!!"))));
		assertThat("booo", is(equalTo(App.calmString("!!!boo!o!!"))));
	}

	@Test
	public void testCalmAttendees() {
		/*
		 * todo: Please create jUnit code using modern approach to test
		 * calmAttendees method on App.java at least create 3 test case using
		 * 'assertThat'
		 */
		List<String> names2 = new LinkedList<String>();
		names2.add("Republican");
		names2.add("Democrat");
		names2.add("Republican");
		names2.add("Democrat");
		names2.add("Hanura");
		names2.add("PDIP");
		names2.add("PKB");
		List<String> litong = App.calmAttendees(names2);
		boolean check = (litong.contains("Republican")&&litong.contains("Democrat"));
			assertFalse(check);
	}

}
