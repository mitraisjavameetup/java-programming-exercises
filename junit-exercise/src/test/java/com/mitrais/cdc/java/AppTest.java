package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

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
		String[] cString = {"!foo!!","HEI!!!!!!", "Ha!!What!!","!N!o!o!o!"};
		for(int i=0; i<cString.length; i++){
			cString[i] = App.calmString(cString[i]);
		}
		
		assertThat(cString[0], is(equalTo("foo")));
		assertThat(cString[1], is(equalTo("HEI")));
		assertThat(cString[2], is(equalTo("HaWhat")));
		assertThat(cString[3], is(equalTo("Nooo")));
		
		assertEquals(cString[0],"foo");
		assertEquals(cString[1],"HEI");
		assertEquals(cString[2],"HaWhat");
		assertEquals(cString[3],"Nooo");
    }
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		
		List<String> att1 = new ArrayList<>();
		List<String> att2 = new ArrayList<>();
		List<String> att3 = new ArrayList<>();
		
		att1.add("Republican");
		att1.add("Indonesia");
		att1.add("Pancasila");
		
		att2.add("Democrat");
		att2.add("Pancasila");
		att2.add("Indonesia");
		
		att3.add("Democrat");
		att3.add("Republican");
		att3.add("Indonesia");
		
		App.calmAttendees(att1);
		App.calmAttendees(att2);
		App.calmAttendees(att3);
		
		assertThat(att1.size(), is(equalTo(3)));
		assertThat(att2.size(), is(equalTo(3)));
		assertThat(att3.size(), is(equalTo(2)));
		
    }
}
