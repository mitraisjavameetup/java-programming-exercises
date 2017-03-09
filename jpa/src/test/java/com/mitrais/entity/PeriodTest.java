package com.mitrais.entity;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Angela_I3218 on 3/9/2017.
 */
public class PeriodTest {
    private static SimpleDateFormat formatter =
            new SimpleDateFormat("yyyy-MM-dd");
    /**
     *   construct employee entity and set all fields
     **/
    @Test
    public void testEmploymentPeriod()
    {
        Date startDate = new Date();
        Date endDate = new Date();
        try {
            startDate = formatter.parse("2013-01-01");
            endDate = formatter.parse("2014-12-31");
        } catch( ParseException ex ) {
            System.err.println( ex.toString() );
        }
        Period period = new Period();
        period.setStartDate(startDate);
        period.setEndDate(endDate);

        // assertion
        assertThat(
                String.format("Start Date equal to '%s'", startDate.toString()),
                period.getStartDate(),
                is(equalTo(startDate))
        );

        assertThat(
                String.format("End Date equal to '%s'", endDate.toString()),
                period.getEndDate(),
                is(equalTo(endDate))
        );
    }

    /**
     *   construct employee entity and set all fields
     **/
    @Test
    public void testEmployeeWithPeriod()
    {
        Date birthDate = new Date();
        Date hireDate = new Date();
        Date startDate = new Date();
        Date endDate = new Date();
        try {
            birthDate = formatter.parse("1989-10-01");
            hireDate = formatter.parse("2017-07-02");
            startDate = formatter.parse("2013-01-01");
            endDate = formatter.parse("2014-12-31");
        } catch( ParseException ex ) {
            System.err.println( ex.toString() );
        }
        Employee employee = new Employee();
        employee.setName("michael jacob")
                .setDateOfBirth(birthDate)
                .setGender("male")
                .setMaritalStatus("single")
                .setPhone("+628123456")
                .setEmail("michael.jacob@mitrais.com")
                .setHireDate(hireDate);

        Period period = new Period();
        period.setStartDate(startDate);
        period.setEndDate(endDate);

        employee.setPeriod(period);

        // assertion
        assertThat(
                "Name other than 'michael jacob'",
                employee.getName(),
                is(equalTo("michael jacob"))
        );
        assertThat(
                String.format("Date of birth not equal to '%s'", birthDate.toString()),
                employee.getDateOfBirth(),
                is(equalTo(birthDate))
        );
        assertThat(
                "Gender other than 'male'",
                employee.getGender(),
                is(equalTo("male"))
        );
        assertThat(
                "Marital status other than 'single'",
                employee.getMaritalStatus(),
                is(equalTo("single"))
        );
        assertThat(
                "Phone other than '+628123456'",
                employee.getPhone(),
                is(equalTo("+628123456"))
        );
        assertThat(
                "Email other than 'michael.jacob@mitrais.com'",
                employee.getEmail(),
                is(equalTo("michael.jacob@mitrais.com"))
        );
        assertThat(
                String.format("Hire date not equal to '%s'", hireDate.toString()),
                employee.getHireDate(),
                is(equalTo(hireDate))
        );
        assertThat(
                String.format("Start Date equal to '%s'", startDate.toString()),
                employee.getPeriod().getStartDate(),
                is(equalTo(startDate))
        );
        assertThat(
                String.format("End Date equal to '%s'", endDate.toString()),
                employee.getPeriod().getEndDate(),
                is(equalTo(endDate))
        );
    }
}
