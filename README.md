# Web Application Project

This is a web application project developed with the aim of providing a course management system. The project includes functionalities for creating, updating, deleting, and viewing courses, categories, products, and users.

## Functionalities

- **User Management**: Creation, viewing, updating, and deletion of users.
- **Product Management**: Creation, viewing, updating, and deletion of products.
- **Category Management**: Creation, viewing, updating, and deletion of categories.
- **Order Management**: Creation, viewing, updating, and deletion of orders.
- **Exception Handling**: Custom exception handling mechanism.

## Project Structure

The project is organized as follows:

- **src/main/java**: Contains the Java source code files.
  - **com/educandoweb/course/entities**: System entities.
  - **com/educandoweb/course/repositories**: Repository interfaces for data access.
  - **com/educandoweb/course/resources**: REST resources for API exposure.
  - **com/educandoweb/course/service**: Business logic and services.
  - **com/educandoweb/course/resources/exceptions**: Exception handlers.
  - **com/educandoweb/course/service/exceptions**: Custom exceptions.

- **src/main/resources**: Contains project resources, such as configuration files.
  - **application.properties**: Application configurations.

- **src/test/java**: Contains unit and integration tests.
  - **com/educandoweb/course**: Application tests.

## Technologies Used

- **Java 11**
- **Spring Boot**
- **JPA / Hibernate**
- **Maven**
- **H2 Database** (for testing and development)

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   cd your-repository
2. **Compile and run the project**:   
   ```bash
   mvn spring-boot:run
3. **Access the application**:
   ```bash
   Open your browser and go to http://localhost:8080
