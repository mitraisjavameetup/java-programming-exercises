package com.mitrais.cdc.java;

import java.util.*;
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
		String s1 = "!!!Foo!!!";
		String s2 = "Hahaha!";
		String s3 = "No way.";
		String s4 = "!l!a!l!a!";
		String s5 = "!Boo";
		String s6 = "hahaha...";
		String s7 = "Wow!!!";
		String s8 = "!Nothing!";
		
		assertThat("Foo", is(equalTo(App.calmString(s1))));
		assertThat("Hahaha", is(equalTo(App.calmString(s2))));
		assertThat("No way.", is(equalTo(App.calmString(s3))));
		assertThat("lala", is(equalTo(App.calmString(s4))));
		
		assertEquals("Boo", App.calmString(s5));
		assertEquals("hahaha...", App.calmString(s6));
		assertEquals("Wow", App.calmString(s7));
		assertEquals("Nothing", App.calmString(s8));
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> s1 = new LinkedList<String>();
		List<String> s2 = new LinkedList<String>();
		List<String> s3 = new LinkedList<String>();
		List<String> s4 = new LinkedList<String>();
		
		s1.add("Republican");
		s1.add("Democrat");
		s1.add("Republican");
		s1.add("Democrat");
		List<String> result1 = App.calmAttendees(s1);
		
		s2.add("Green Party");
		s2.add("Blue Party");
		List<String> result2 = App.calmAttendees(s2);
		
		s3.add("Blue Party");
		s3.add("Republican");
		List<String> result3 = App.calmAttendees(s3);
		
		s4.add("Republican");
		s4.add("Democrat");
		List<String> result4 = App.calmAttendees(s4);
		
		assertThat(result1.contains("Republican") && result1.contains("Democrat"), is(equalTo(false)));
		assertThat(result2.contains("Republican") && result2.contains("Democrat"), is(equalTo(false)));
		assertThat(result3.contains("Republican") && result3.contains("Democrat"), is(equalTo(false)));
		assertThat(result4.contains("Republican") && result4.contains("Democrat"), is(equalTo(false)));
		
    }
}
