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
public class EmploymentHistoryTest {
    private static SimpleDateFormat formatter =
            new SimpleDateFormat("yyyy-MM-dd");
    /**
     *   construct employee entity and set all fields
     **/
    @Test
    public void testProjectId()
    {
        String projectName = "EXO Platform";
        String role = "Java Developer";
        ProjectId projectId = new ProjectId(projectName, role);

        // assertion
        assertThat(
                String.format("Project Name equal to '%s'", projectName),
                projectId.getProjectName(),
                is(equalTo(projectName))
        );

        assertThat(
                String.format("Project role equal to '%s'", role),
                projectId.getRole(),
                is(equalTo(role))
        );
    }

    /**
     *   construct employee entity and set all fields
     **/
    @Test
    public void testEmploymentHistory()
    {
        Date startDate = new Date();
        Date endDate = new Date();
        try {
            startDate = formatter.parse("2013-01-01");
            endDate = formatter.parse("2014-12-31");
        } catch( ParseException ex ) {
            System.err.println( ex.toString() );
        }

        String projectName = "EXO Platform";
        String role = "Java Developer";
        long empId = 99;
        String jobDesc = "Development of EXO Platform, Maintanance of EXO Platform";

        EmploymentHistory project = new EmploymentHistory();
        project.setId(new ProjectId(projectName, role));

        Period period = new Period();
        period.setStartDate(startDate);
        period.setEndDate(endDate);

        project.setPeriod(period);
        project.setEmpId(empId);
        project.setJobDescription(jobDesc);

        // assertion
        assertThat(
                String.format("Project Name equal to '%s'", projectName),
                project.getId().getProjectName(),
                is(equalTo(projectName))
        );

        assertThat(
                String.format("Project role equal to '%s'", role),
                project.getId().getRole(),
                is(equalTo(role))
        );

        assertThat(
                String.format("Start Date equal to '%s'", startDate.toString()),
                project.getPeriod().getStartDate(),
                is(equalTo(startDate))
        );

        assertThat(
                String.format("End Date equal to '%s'", endDate.toString()),
                project.getPeriod().getEndDate(),
                is(equalTo(endDate))
        );

        assertThat(
                String.format("Emp Id equal to '%s'", empId),
                project.getEmpId(),
                is(equalTo(empId))
        );

        assertThat(
                String.format("Job Description equal to '%s'", jobDesc),
                project.getJobDescription(),
                is(equalTo(jobDesc))
        );
    }
}
