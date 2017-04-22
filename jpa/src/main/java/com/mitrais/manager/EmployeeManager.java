package com.mitrais.manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.mitrais.entity.Employee;
import com.mitrais.entity.InternalProject;
import com.mitrais.entity.EmploymentHistory;
import com.mitrais.util.EntityManagerUtil;

import java.util.List;

public class EmployeeManager {

	private static EmployeeManager instance;

	private EntityManager entityManager;

	private EmployeeManager() {
		entityManager = EntityManagerUtil.getEntityManager();
	}

	public static EmployeeManager getInstance() {
		if (instance == null) {
			instance = new EmployeeManager();
		}
		return instance;
	}

	/**
	 * write Employee to database/ persistent storage
	 * 
	 * @param employee
	 *            the row to be inserted
	 **/
	public void create(Employee employee) {
		// TODO create employee and save to database
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
	}

	/**
	 * read employee row from database
	 * 
	 * @param employeeId
	 *            the id of row that will be fetched
	 * @return Employee entity mapped from table, otherwise null
	 **/
	public Employee read(long employeeId) {
		// TODO find employee and return
		Employee emp = entityManager.find(Employee.class, employeeId);
		if (emp != null) {
			return emp;
		} else {
			return null;
		}
	}

	/**
	 * update employee if exist
	 * 
	 * @param employee
	 *            row that will replace
	 * @param employeeId
	 *            the id of row that will be replaced
	 **/
	@Transactional
	public void update(Employee employee) {
		// TODO update row in table
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.flush();
		entityManager.getTransaction().commit();
		
	}

	/**
	 * delete employee if exist
	 * 
	 * @param employeeId
	 *            table emmployee primary key
	 **/
	@Transactional
	public void delete(Employee employee) {
		// TODO delete row in table
		if (employee != null)
		{
			entityManager.getTransaction().begin();
			Employee emp = entityManager.find(Employee.class, employee);
			entityManager.remove(emp);
			entityManager.flush();
			entityManager.getTransaction().commit();
		}
		
	}

	public void close() {
		if (entityManager != null)
			entityManager.close();
	}

	/**
	 * write Employment History to database/ persistent storage
	 * 
	 * @param project
	 *            the row to be inserted
	 **/
	@Transactional
	public void createEmploymentHistory(EmploymentHistory project) {
		// TODO create project and save to database
		entityManager.getTransaction().begin();
		entityManager.persist(project);
		entityManager.flush();
		entityManager.getTransaction().commit();
		
	}

	public List getEmployeeByLocation(String officeLocation) {
		// TODO please execute static query Employee.filterByLocation
		return entityManager.createNamedQuery("Employee.filterByLocation")
				.setParameter("officeLocation", officeLocation)
				.getResultList();
	}

	public List getEmployeeByProject(String projectName) {
		// TODO please execute static query Employee.filterByProject
		return entityManager.createNamedQuery("Employee.filterByProject")
				.setParameter("projectName", projectName)
				.getResultList();
	}

	public void removeProjectByEmployeeID(Long empId) {
		// TODO please create dynamic query to delete employee by ID	
	}

	public List getAllEmploymentHistory() {
		return entityManager.createQuery("SELECT a FROM EmploymentHistory a").setMaxResults(20).getResultList();
	}

	/**
	 * if EntityManager's transaction is active, all transaction are rolled back
	 **/
	public void rollbackAll() {
		if (entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().rollback();
		}
	}
}