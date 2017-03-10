# Introduction

This project assignment on Java Persistence API for Mitrais Java Training.

# Prerequisites

- MySQL Database Server on localhost:3306
    + user access for root with empty password
    + empty database java_bootcamp, WARNING database might be overwritten
- Apache Maven
    + pay attention for proxy usage in your network
- Java SE SDK kit

# Assignments

1. Implement Employee entity which mapped to table t_employee.
2. Implement EmployeeManager, which is entity manager for 
Employee entity. EmployeeManager has CRUD method.
3. Modify Employee entity, in order to associate it with
Address entity which is 1-1 association. Employee entity storing
address_id is dependant entity to the Addres entity and assocation 
is optional.
4. Modify Employee entity, to associate it with GradeHistory entity.
Employee and GradeHistory entities have 1-n association. This
association is optional. Foreign key column is employee_id.
5. Modify Employee entity, to associate it n-1 with BranchOffice 
entity. Employee entity is dependant to BranchOffice entity.
The foreign key column is office_id.
6. Modify Employee entity, and associate it n-n with InternalProject
entity. The assocation is optional. The mapping table's name is
t_employee_project, which has two columns employee_id and 
internal_project_id.
7. Implement EmploymentHistory and Period which are embeddable 
entity inside Employee entity.
8. Implement EmployeeEntityListener as EntityListener for Employee entity.
9. Implement static and dynamic query on defined entities.

# Configuration

- src/main/resources/META-INF/persistence.xml
    - Hibernate persistence hbm xml
- src/test/resources/META-INF/services/java.sql.Driver
    - Driver to be initialized
- src/test/resources/connection.config
    - jdbc connection configurations for testing purpose

# Commands

- mvn compile
- mvn test
- mvn exec:java -Dexec.mainClass="com.mitrais.App"
    - MAVEN_OPTS=-ea : to enable assertions
- mvn clean

# Others

- If you want to use another database, please do the following:
    + modify persistence.xml
    + modify connection.config
    + add jdbc driver and change the Driver