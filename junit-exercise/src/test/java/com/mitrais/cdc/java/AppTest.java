package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		/*Traditional Approach*/
		assertEquals("foo",App.calmString("foo!"));
		assertEquals("baa",App.calmString("baa!"));
		assertEquals("saa",App.calmString("saa!"));
		assertEquals("era",App.calmString("era!"));
		
		/*Modern Approach*/
		assertThat("foo",is(App.calmString("foo!")));
		assertThat("baa",is(App.calmString("baa!")));
		assertThat("saa",is(App.calmString("saa!")));
		assertThat("era",is(App.calmString("era!")));
		
    }
	
	@Test
	public void testCalmAttendees()
    {
        /* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
		
		String[] countryNameTemp={"Republican Democrat of Indonesia","Republican China","Republican Malaysia"};
		List<String> countryName= Arrays.asList(countryNameTemp);
		
		countryName=App.calmAttendees(countryName);
		
		
		assertThat(countryName.get(0).contains("Republican") && countryName.get(0).contains("Democrat"),is(false));
		assertThat(countryName.get(1).contains("Republican") && countryName.get(1).contains("Democrat"),is(false));
		assertThat(countryName.get(2).contains("Republican") && countryName.get(2).contains("Democrat"),is(false));
		
    }
	
}
