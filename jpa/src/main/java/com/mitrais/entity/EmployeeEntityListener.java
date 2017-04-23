package com.mitrais.entity;

import java.util.Date;

public class EmployeeEntityListener  {
    // TODO implement this entity listener class to auto update employee last modified after create/update employee
    public void setLastModified(final Employee employee) {
    	employee.setLastModified(new Date());
    }
}
