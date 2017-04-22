package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;

// TODO please add annotation for entity class

@Embeddable
@Table(name="t_period")
public class Period {
    // TODO implement this entity class
    private Date startDate;

    private Date endDate;

    public Period() {

    }

    public Period(Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
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
