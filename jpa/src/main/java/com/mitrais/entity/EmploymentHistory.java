package com.mitrais.entity;

import javax.persistence.*;

// TODO please add annotation for entity class
@Entity public class EmploymentHistory {
    // TODO add proper annotation to this entity class
	@Id
    private ProjectId id;
    private Period period;
    @Column(name="job_description")
    private String jobDescription;
    @Column(name="emp_id")
    private Long empId;

    public EmploymentHistory() {

    }

	public ProjectId getId() {
		return id;
	}

	public EmploymentHistory setId(ProjectId id) {
		this.id = id;
		return this;
	}

	public Period getPeriod() {
		return period;
	}

	public EmploymentHistory setPeriod(Period period) {
		this.period = period;
		return this;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public EmploymentHistory setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
		return this;
	}

	public Long getEmpId() {
		return empId;
	}

	public EmploymentHistory setEmpId(Long empId) {
		this.empId = empId;
		return this;
	}
    
    
}
