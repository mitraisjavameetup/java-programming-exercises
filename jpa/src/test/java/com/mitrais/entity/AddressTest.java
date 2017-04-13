package com.mitrais.entity;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 *  unit test for Address entity
 **/
public class AddressTest
{
	/**
	 *  construct Address entity and set the value of attributes
	 **/
	@Test
	public void testAddress()
	{
		Address address = new Address();
		address.setAddress("Jln. Surya Sumantri")
			.setCity("Bandung")
			.setPostalCode("40161");
		// assertion
		assertThat("Address should be 'Jln. Surya Sumantri'",
			address.getAddress(),
			is(equalTo("Jln. Surya Sumantri"))
		);
		assertThat("City should be 'Bandung'",
			address.getCity(),
			is(equalTo("Bandung"))
		);
		assertThat("Postal code should be '40161'",
			address.getPostalCode(),
			is(equalTo("40161"))
		);
	}
}