package com.mitrais.manager;

import javax.persistence.EntityManager;

import com.mitrais.entity.Employee;
import com.mitrais.util.EntityManagerUtil;

public class EmployeeManager {

	private static EmployeeManager instance;

	private EntityManager entityManager;

	private EmployeeManager() {
		entityManager = EntityManagerUtil 
			.getEntityManager();
	}

	public static EmployeeManager getInstance() {
		if (instance == null) {
			instance = new EmployeeManager();
		}
		return instance;
	}

	/**
	 *  write Employee to database/ persistent storage
	 *  @param employee  the row to be inserted
	 **/
	public void create(Employee employee) {
		// TODO create employee and save to database
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
	}

	/**
	 *  read employee row from database
	 *	@param employeeId  the id of row that 
	 *						will be fetched
	 *	@return Employee entity mapped from table, otherwise null
	 **/
	public Employee read(long employeeId) {
		// TODO find employee and return
		return entityManager.find(Employee.class,
			Long.valueOf(employeeId));
	}

	/**
	 *  update employee if exist
	 *	@param employee    row that will replace 
	 *	@param employeeId  the id of row that 
	 *						will be replaced
	 **/
	public void update(Employee employee) {
		// TODO update row in table 
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.getTransaction().commit();		
	}

	/**
	 *  delete employee if exist
	 *	@param employeeId table emmployee primary key 
	 **/
	public void delete(Employee employee) {
		// TODO delete row in table
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
	}

	public void close() {
		if (entityManager != null)
			entityManager.close();
	}
}