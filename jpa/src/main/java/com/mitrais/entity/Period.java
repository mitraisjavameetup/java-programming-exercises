package com.mitrais.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO please add annotation for entity class
@Embeddable
@Table(name = "t_period")
public class Period {
    // TODO implement this entity class
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;

	public Period() {

    }

    public void setStartDate(Date startDate) {
    	this.startDate = startDate;
    }

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}
}
