package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "t_period")

@EntityListeners(EmployeeEntityListener.class)
// TODO please add annotation for entity class
public class Period {
    // TODO implement this entity class
	@Id
	@Column(name = "start_date")
    private Date startDate;
	@Column(name = "end_date")
    private Date endDate;

    public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Period() {

    }

    public void setStartDate(Date startDate) {
    	this.startDate = startDate;
    }
}
