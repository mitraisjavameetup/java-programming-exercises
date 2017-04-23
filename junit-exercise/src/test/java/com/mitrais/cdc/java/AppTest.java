package com.mitrais.cdc.java;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
/**
 * Unit test for simple App.
 */
public class AppTest{
//	public static void main(String[] args){
//		App.calmString("!foo!!");
//	}
	@Test
	public void testCalmString()
    {
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
		String[] words = {"go!!!", "foo!!!", "!woo!", "!!hoo"};
		for(int i=0;i<words.length;i++){
			words[i] = App.calmString(words[i]);		
		}
		assertThat(words[0], is(equalTo("go")));
		assertThat(words[1], is(equalTo("foo")));
		assertThat(words[2], is(equalTo("woo")));
		assertThat(words[3], is(equalTo("hoo")));
		assertEquals(words[0], "go");
		assertEquals(words[1], "foo");
		assertEquals(words[2], "woo");
		assertEquals(words[3], "hoo");
    }

	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> party1 = new ArrayList<>();
		party1.add("Republican");
		party1.add("Manusia Biasa");
		party1.add("Manusia Biasa");
		party1.add("Manusia Biasa");
		party1.add("Republican");
		
		List<String> party2 = new ArrayList<>();
		party2.add("Manusia Biasa");
		party2.add("Manusia Biasa");
		party2.add("Republican");
		party2.add("Democrat");
		party2.add("Manusia Biasa");
		
		List<String> party3 = new ArrayList<>();
		party3.add("Manusia Biasa");
		party3.add("Republican");
		party3.add("Republican");
		party3.add("Manusia Biasa");
		party3.add("Democrat");
		
		App.calmAttendees(party1);
		App.calmAttendees(party2);
		App.calmAttendees(party3);

		assertThat(party1.size(), is(equalTo(5)));
		assertThat(party2.size(), not(equalTo(5)));
		assertThat(party3.size(), not(equalTo(5)));
		assertEquals(party1.size(), 5);
		assertNotEquals(party2.size(), 5);
		assertNotEquals(party3.size(), 5);
    }
}
