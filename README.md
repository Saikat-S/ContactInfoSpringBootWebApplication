# Contact Info Spring Boot Web Application
A Contact Information management Spring Boot Web Application. It's a coding task from TigerIT Bangladesh Ltd.

### Spring Boot Starters Information:
- **Generate:** Maven Project
- **Java Version:** 11 
- **Spring Boot:** 2.5.5
- **Group:** com.example
- **Artifact:** ContactInfoSpringBootWebApplication
- **Name:** ContactInfoSpringBootWebApplication
- **Package Name:** com.example.ContactInfoSpringBootWebApplication
- **Packaging:** jar
- **Dependencies:** Spring Web, Spring Data JPA, MySQL Driver, DevTools, Thymeleaf

### Database
- MySQL Community server
- MySQL Workbench

### IDE and OS
- VSCode
- Ubuntu 20.00


### Compile the project:
First you have to create a database schema. Then edit the [application.properties](https://github.com/Saikat-S/ContactInfoSpringBootWebApplication/blob/main/src/main/resources/application.properties) file with your **datasource.url** , **datasource.username** and **datasource.password**. 

```
spring.datasource.url=jdbc:mysql://localhost:3306/contactinfodb
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=create
spring.jpa.properties.hibernate.format_sql=true
```
Now run the project with your IDE. Visit http://localhost:8080/ from a brower 
to run the application.
