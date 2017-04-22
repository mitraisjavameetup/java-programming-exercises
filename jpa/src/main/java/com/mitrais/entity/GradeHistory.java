package com.mitrais.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_grade_history")
public class GradeHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "job_grade")
	private JobGrade jobGrade;
	@Column(
		name = "employee_id",
		nullable = false,
		insertable = false,
		updatable = false
	)
	private Long employeeId;

	public GradeHistory() {}

	public Long getId() {
		return id;
	}

	public GradeHistory setId(Long id) {
		this.id = id;
		return this;
	}

	public Date getStartDate() {
		return startDate;
	}

	public GradeHistory setStartDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	public Date getEndDate() {
		return endDate;
	}


	public GradeHistory setEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}

	public JobGrade getJobGrade() {
		return jobGrade;
	}

	public GradeHistory setJobGrade(JobGrade jobGrade) {
		this.jobGrade = jobGrade;
		return this;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public GradeHistory setEmployeeId(Long id) {
		this.employeeId = id;
		return this;
	}
}