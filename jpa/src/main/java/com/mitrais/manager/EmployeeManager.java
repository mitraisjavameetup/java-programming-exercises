package com.mitrais.manager;

import javax.persistence.EntityManager;

import com.mitrais.entity.Employee;
import com.mitrais.entity.InternalProject;
import com.mitrais.entity.EmploymentHistory;
import com.mitrais.util.EntityManagerUtil;

import java.util.List;

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
		entityManager.close();


	}

	/**
	 *  read employee row from database
	 *	@param employeeId  the id of row that 
	 *						will be fetched
	 *	@return Employee entity mapped from table, otherwise null
	 **/
	public Employee read(long employeeId) {
		Employee employ = entityManager.find(Employee.class, employeeId);
		// TODO find employee and return
		return employ;
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
		entityManager.close();
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
		entityManager.close();
	}

	public void close() {
		if (entityManager != null)
			entityManager.close();
	}

	/**
	 *  write Employment History to database/ persistent storage
	 *  @param project  the row to be inserted
	 **/
	public void createEmploymentHistory(EmploymentHistory project) {
		// TODO create project and save to database
		entityManager.getTransaction().begin();
		entityManager.persist(project);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	public List getEmployeeByLocation(String officeLocation) {
		// TODO please execute static query Employee.filterByLocation
		List list = (List) entityManager.createNamedQuery("Employee.filterByLocation", Employee.class).setParameter("officeLocation", officeLocation);

		return list;
	}

	public List getEmployeeByProject(String projectName) {
		return null;
	}

	public void removeProjectByEmployeeID(Long empId) {
		// TODO please create dynamic query to delete employee by ID
	}

	public List getAllEmploymentHistory() {
		return entityManager.createQuery(
				"SELECT a FROM EmploymentHistory a")
				.setMaxResults(20)
				.getResultList();
	}

	/**
	 *  if EntityManager's transaction is active,
	 *  all transaction are rolled back
	 **/
	public void rollbackAll() {
		if (entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().rollback();
		}
	}
}