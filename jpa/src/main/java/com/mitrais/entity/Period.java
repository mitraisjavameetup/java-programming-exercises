package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import java.util.Date;

// TODO please add annotation for entity class
@Embeddable
public class Period {
    // TODO implement this entity class
	@Column(name = "startDate")
    private Date startDate;
	@Column(name ="endDate")
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
