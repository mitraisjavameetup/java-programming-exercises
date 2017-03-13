package com.mitrais.entity;

import javax.persistence.*;

// TODO please add annotation for entity class
public class EmploymentHistory {
    // TODO add proper annotation to this entity class
    private ProjectId id;
    private Period period;
    @Column(name="job_description")
    private String jobDescription;
    @Column(name="emp_id")
    private Long empId;

    public EmploymentHistory() {

    }
}
