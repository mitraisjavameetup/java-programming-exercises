package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
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
		String word1 = "!!!fooo!!!";
		String word2 = "!!asdf!fooo!!!";
		String word3 = "!!!fo!!oo!!!";
		String word4 = "!!!f!o!o!o!!!";
		String calmword1 = App.calmString(word1);
		String calmword2 = App.calmString(word2);
		String calmword3 = App.calmString(word3);
		String calmword4 = App.calmString(word4);
//		System.out.println(word1);
		assertEquals(calmword1,"fooo");
		assertEquals(calmword2,"asdffooo");
		assertEquals(calmword3,"fooo");
		assertEquals(calmword4,"fooo");
		
		
		assertThat("fooo", is(equalTo(App.calmString(word1))));
		assertThat("asdffooo", is(equalTo(App.calmString(word2))));
		assertThat("fooo", is(equalTo(App.calmString(word3))));
		assertThat("fooo", is(equalTo(App.calmString(word4))));
    }
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		List<String> parties = new ArrayList<String>();
		parties.add("Republican");
		parties.add("RepublicanDemocrat");
		parties.add("test");
		parties.add("Democrat");
		parties.add("DemocratRepublican");
		parties.add("DemocratRepublican");
		parties.add("PDIP");
		parties.add("Demokrat");
		parties.add("Democrat");
		int count;
		count = App.calmAttendees(parties);
		assertThat(count, is(equalTo(6)));	
    }
}
