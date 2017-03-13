package com.mitrais.entity;

import static org.junit.Assert.assertThat;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

public class BranchOfficeTest
{
	@Test
	public void testBranchOffice()
	{
		BranchOffice office = new BranchOffice();
		office.setCity("Bandung")
			.setAddress("Jln. Surya Sumantri")
			.setPhone("+62222012345")
			.setPostalCode("40161");
		// assertion
		assertThat("City should be Bandung",
			office.getCity(),
			is(equalTo("Bandung"))
		);
		assertThat("Address should be Jln. Surya Sumantri",
			office.getAddress(),
			is(equalTo("Jln. Surya Sumantri"))
		);
		assertThat("Phone should be +62222012345",
			office.getPhone(),
			is(equalTo("+62222012345"))
		);
		assertThat("Postal code should be 40161",
			office.getPostalCode(),
			is(equalTo("40161"))
		);
	}
}