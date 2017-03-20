package com.mitrais.cdc.java;

import org.junit.Test;



import static org.junit.Assert.*;


import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;


/**
 * Unit test for simple App.
 */
public class AppTest{
	@Test
	public void testCalmString()
    {
		assertThat("foo", is(equalTo(App.calmString("!foo!!"))));
		assertThat("trololol", is(equalTo(App.calmString("!trololol!"))));
		assertThat("reee", is(equalTo(App.calmString("reee!!!"))));
		assertThat("bam", is(equalTo(App.calmString("bam"))));
		
		assertEquals("lala", App.calmString("!lala!"));
		assertEquals("yum", App.calmString("!yum!!"));
		assertEquals("do", App.calmString("!do"));
		assertEquals("singggg", App.calmString("singggg!!!!"));
		
        /* todo:
         * Please create jUnit code
         * to test calmString method on App.java
         * at least create 4 test cases using 'assertThat' (modern approach)
         * and 4 test cases using 'assertEquals' (traditional approach)
         */
    }
	@Test
	public void testCalmAttendees()
    {
		List<String> party = new LinkedList<>();
		party.add("President");
		party.add("Communist");
		party.add("Democrat");
		party.add("Republican");
		party.add("RepublicanDemocrat");
		party.add("DemocratRepublican");
		party.add("RepublicanDemocratRepublican");
		party.add("DemocratDemocratRepublican");
		party.add("DemocratRepublicanRepublican");
		party.add("DemocratRepublicanDemocrat");
		
		App.calmAttendees(party);
		
		List<String> party2 = new LinkedList<>();
		party2.add("President");
		party2.add("Communist");
		party2.add("Democrat");
		party2.add("Republican");
		party2.add("RepublicanDemocrat");
		party2.add("DemocratRepublican");
		party2.add("RepublicanDemocratRepublican");
		party2.add("DemocratDemocratRepublican");
		
		
		App.calmAttendees(party2);
		
		List<String> partyy = new LinkedList<>();
		partyy.add("President");
		partyy.add("Communist");
		partyy.add("Democrat");
		partyy.add("RepublicanDemocratRepublican");
		partyy.add("DemocratRepublicanRepublican");
		partyy.add("DemocratRepublicanDemocrat");
		
		App.calmAttendees(partyy);
		
		
		assertThat(party.size(), is(equalTo(9)));
		assertThat(party2.size(), is(equalTo(7)));
		assertThat(partyy.size(), is(equalTo(6)));
		
		//assertThat(party, is("re));
		/* todo:
         * Please create jUnit code using modern approach
         * to test calmAttendees method on App.java
         * at least create 3 test case using 'assertThat'
         */
    }
}
