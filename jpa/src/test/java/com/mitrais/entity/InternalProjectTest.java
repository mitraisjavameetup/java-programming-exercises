package com.mitrais.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *  Unit test for Project entity
 **/
public class InternalProjectTest
{
	private static SimpleDateFormat formatter =
		new SimpleDateFormat("yyyy-MM-dd");
	/**
	 *  construct Project entity and set value
	 **/
	@Test
	public void testInternalProject()
	{
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = formatter.parse("2015-01-04");
			endDate = formatter.parse("2015-12-24");
		} catch( ParseException ex ) {
			System.err.println( ex.toString() );
		}
		InternalProject project = new InternalProject();
		project.setStartDate( startDate )
			.setEndDate( endDate )
			.setProjectName( "AsteRx" )
			.setProductName( "Medirecords" );
		// assertion
		assertThat("Start date should be 4 Jan 2015",
			project.getStartDate(),
			is(equalTo(startDate))
		);
		assertThat("End date should be 24 Dec 2015",
			project.getEndDate(),
			is(equalTo(endDate))
		);
		assertThat("Project name should be AsteRx",
			project.getProjectName(),
			is(equalTo("AsteRx"))
		);
		assertThat("Product name should be Medirecords",
			project.getProductName(),
			is(equalTo("Medirecords"))
		);
	}
}