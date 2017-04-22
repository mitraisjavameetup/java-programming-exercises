package com.mitrais.entity;

import javax.persistence.EntityListeners;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@EntityListeners(Employee.class)
public class EmployeeEntityListener  {
    // TODO implement this entity listener class to auto update employee last modified after create/update employee
    @PrePersist
    @PreUpdate
	public void setLastModified(final Employee employee) {
    	employee.setLastModified(new Date());
    }
}
