# Introduction

This project assignment on Java Persistence API for Mitrais Java Training.

# Prerequisites

- MySQL Database Server on localhost:3306
    + user access for root with empty password
    + empty database java_bootcamp, WARNING database might be overwritten
- Apache Maven
    + pay attention for proxy usage in your network
- Java SE SDK kit

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
- mvn clean
