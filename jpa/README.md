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
3. Implement Address entity, which has 1-1 relationship and 
employeeId as foreign key to Employee entity.
4. Implement GradeHistory entity, which has n-1 relationship 
and employeeId as foreign key to Employee entity.
5. Implement OfficeLocation entity, which has 1-n relationship
and employeeId as foreign key to Employee entity.
6. Implement Project entity, which has n-n relationship and
employeeId as foreign key to Employee entity.
7. __TODO__ embedded object
8. __TODO__ entity listener
9. __TODO__ JPQL or Criteria Builder

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

