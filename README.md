# Project Setup and Running Locally

<h3>API Endpoints</h3>

- POST /v2/master_list    (get master list)
- POST /v2/master_list/dummy data     (create dummy data)

<h3>Prerequisites</h3>

1) dependency 
- Spring Web 
- Spring Jpa
- Spring PostgreSQL
- Lombok

<h3>Springboot version</h3>

- 3.4.3

<h3>Java version</h3>
- 17


<h3>Configure the Database</h3>

 - create masterdb database in your PostgreSQL

- Update src/main/resources/application.properties with your database credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5430/masterdb
spring.datasource.username=<your database username>
spring.datasource.password=<your database password>

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
```


<h3>Build and Run the Project</h3>
- Open and Run project on Intellij.

<h3>localhost start on:</h3>
- Server running on Port 8082.
- If you want to change port then Change it in application.properties.
