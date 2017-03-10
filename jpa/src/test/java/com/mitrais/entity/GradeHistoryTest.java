package com.mitrais.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *  unit test for GradeHistory entity
 **/
public class GradeHistoryTest
{
	private static SimpleDateFormat formatter = 
		new SimpleDateFormat("yyyy-MM-dd");

	@Test
	public void testGradeHistory()
	{
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = formatter.parse( "2014-01-03" );
			endDate = formatter.parse( "2014-12-24" );
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		GradeHistory grade = new GradeHistory();
		grade.setStartDate(startDate)
			.setEndDate(endDate)
			.setJobGrade(JobGrade.SE_JP);
		// assertion
		assertThat("Start date should be 3 Jan 2014",
			grade.getStartDate(),
			is(equalTo(startDate))
		);
		assertThat("End date should be 24 Dec 2014",
			grade.getEndDate(),
			is(equalTo(endDate))
		);
		assertThat("Job grade should be SE_JP",
			grade.getJobGrade(),
			is(equalTo(JobGrade.SE_JP))
		);
	}
}