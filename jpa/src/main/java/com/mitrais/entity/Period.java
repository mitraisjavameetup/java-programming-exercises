package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import java.util.Date;

// TODO please add annotation for entity class
@Embeddable
public class Period {
    // TODO implement this entity class
	//private long id
	@Column(name="start_date")
    private Date startDate;
	@Column(name="end_date")
    private Date endDate;

    public Period() {

    }

	public Date getStartDate() {
		return startDate;
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

}
