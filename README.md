# 🚀 Spring Boot 3: Complete Course Projects

This repository includes all the hands-on projects completed during the [**Spring Boot 3, Spring 6 & Hibernate for Beginners**](https://www.udemy.com/course/spring-hibernate-tutorial/) course. Each module demonstrates practical use of core Spring technologies with real-world examples.

Spring Boot 3: Learn Spring 6, Spring Core, Spring REST, Spring MVC, Spring Security, Thymeleaf, JPA, Hibernate, MySQL

---

## 📚 Course Modules & Project Folders

| Folder Name                             | Description |
|----------------------------------------|-------------|
| `01-spring-boot-overview`              | Introduction to Spring Boot and setting up a basic application with dependencies. |
| `02-spring-boot-spring-core`           | Covers Spring Core concepts including Beans, Dependency Injection, and ApplicationContext. |
| `03-spring-boot-hibernate-jpa-crud`    | Demonstrates CRUD operations using Spring Data JPA and Hibernate ORM with MySQL. |
| `04-spring-boot-rest-crud`             | Builds RESTful APIs using Spring Boot, including GET, POST, PUT, DELETE endpoints. |
| `05-spring-boot-rest-security`         | Adds authentication and basic security using Spring Security in REST APIs. |
| `06-spring-boot-spring-mvc`            | Web MVC with Thymeleaf, form handling, validation, and templating. |
| `07-jpa-advanced-mappings`             | Covers advanced JPA features: One-to-Many, Many-to-Many, and Join Table mappings. |
| `08-spring-boot-aop`                   | Introduces Aspect-Oriented Programming (AOP) in Spring Boot using annotations and custom aspects. |

---

## 🛠 Technologies Used

- **Spring Boot 3**
- **Spring Framework 6**
- **Spring Core**
- **Spring MVC & REST**
- **Spring Security**
- **JPA & Hibernate**
- **MySQL**
- **Thymeleaf**
- **Spring AOP**

---

## ⚙️ How to Run

1. **Clone the Repository**

   ```bash
   git clone https://github.com/RHJihan/spring-boot-learning.git
   cd spring-boot-learning
   ```

2. **Import into an IDE**

    - Recommended IDEs:
      - [IntelliJ IDEA](https://www.jetbrains.com/idea/)  
      - [Eclipse IDE](https://www.eclipse.org/)

    - Steps:
      1. Open your IDE.
      2. Select **Import Project**.
      3. Choose each folder/module (e.g., `02-spring-boot-spring-core`) as a **Maven project**.
      4. Let the IDE resolve dependencies automatically.

---

3. **Configure MySQL Database**

Projects that involve database functionality require a running MySQL server.  
Edit the `application.properties` file in each applicable module:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. **Run the Project**
From the terminal:
```bash
./mvnw spring-boot:run
```
Or using your IDE's run functionality.

