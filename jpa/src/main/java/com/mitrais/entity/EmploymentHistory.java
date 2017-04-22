package com.mitrais.entity;

import javax.persistence.*;

// TODO please add annotation for entity class
@Entity
@Table(name="t_employment_history")
public class EmploymentHistory {
    // TODO add proper annotation to this entity class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public void setId(ProjectId id) {
		this.id = id;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}
    
}
