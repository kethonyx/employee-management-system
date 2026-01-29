# Employee Management System (Spring Boot + Thymeleaf)

A Spring Boot MVC web application for managing employees with full CRUD functionality, backed by MySQL and rendered with Thymeleaf.

## Tech Stack
- Java
- Spring Boot (MVC)
- Spring Data JPA (Hibernate)
- Thymeleaf
- MySQL
- Maven

## Features
- Create / Read / Update / Delete employees
- Sorted employee list (e.g., by last name)
- Thymeleaf forms with Spring MVC data binding
- Layered architecture (Controller → Service → Repository)
- MySQL persistence with Spring Data JPA

## Project Structure
```text
src/main/java/
  controller/      # MVC controllers (Thymeleaf views)
  service/         # Business logic (EmployeeService)
  dao/             # Spring Data JPA repository
  entity/          # JPA entities
src/main/resources/
  templates/       # Thymeleaf templates
  application.properties
```
Getting Started

1) Prerequisites
	•	Java 17+ (or 21)
	•	Maven
	•	MySQL

2) Create MySQL Database

Create a database (example name used below: employee_directory):

```sql
CREATE DATABASE employee_directory;
```

3) Configure application.properties

Update your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_directory
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4) Run the Application
```run
mvn spring-boot:run
```

Open in browser:
```code
http://localhost:8080/employees/list
```

Main Endpoints (MVC)

•	GET  /employees/list — list employees

•	GET  /employees/showFormForAdd — form to add employee

•	GET  /employees/showFormForUpdate?employeeid={id} — form to update employee

•	POST /employees/save — save (create/update)

•	GET  /employees/delete?employeeid={id} — delete employee

Author

Dinmukhamed Sailau (kethonyx)

