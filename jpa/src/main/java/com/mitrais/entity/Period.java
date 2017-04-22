package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

// TODO please add annotation for entity class
@Embeddable
public class Period {
    // TODO implement this entity class

	private Date startDate;
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
    	this.startDate=startDate;
    }
}
