# Digital-Nurture-hands-on-exercise

Hands-on exercises for Java, design patterns, testing, logging, Spring, data structures, PL/SQL, microservices, JWT, and React.

## Modules

| Module | Folder | Description |
|--------|--------|-------------|
| Design Patterns | `Week 1/Design-principal-and-pattern/` | Adapter, Builder, Factory Method, Singleton, MVC, Dependency Injection |
| Algorithms & Data Structures | `Week 1/Algorithms-Data_Structures/` | E-Commerce product search, Financial forecasting |
| TDD (JUnit & Mockito) | `Week 1/TDD_using_Junit_and_Mockito/` | JUnit basics, Mockito mocking |
| SLF4J Logging | `Week 2/SL4J_Logging_Exercises/` | Logging levels and error messages |
| Spring Core Maven | `Week 2/Spring_Core_Maven/` | Maven setup, XML-based Spring configuration, and dependency injection |
| PL/SQL | `Week 1/PLSQL_Exercises/` | Control structures, stored procedures |
| Spring REST | `Week 3/` | Hello World, country XML configuration, and country REST services |
| Microservices | `Week 4/2 Microservices with API gateway/` | Independent account and loan REST microservices |
| JWT Authentication | `Week 4/5. JWT-Handson/` | Basic authentication and JWT token generation |
| ReactJS HOL | `Week 5/React/ReactJs-HOL/` | Introductory React, Student Management Portal, score calculator, blog app, and CSS Module cohort dashboard exercises |

## Spring Core Maven Exercises

| Exercise | Folder | Output |
|----------|--------|--------|
| Creating and Configuring Maven Project | `Week 2/Spring_Core_Maven/Creating-Configuring-Maven-Project/` | `output/output.txt` |
| Configuring a Basic Spring Application | `Week 2/Spring_Core_Maven/Configuring_Basic_Spring_Application/` | `output/output.txt` |
| Implementing Dependency Injection | `Week 2/Spring_Core_Maven/Implementing-Dependency-Injection/` | `output/output.txt` |

## REST And Microservices Exercises

| Exercise | Folder | Endpoint |
|----------|--------|----------|
| Hello World RESTful Web Service | `Week 3/2.Spring-Rest-Handson/Hello World RESTful Web Service/` | `GET /hello` on port `8083` |
| REST - Country Web Service | `Week 3/2.Spring-Rest-Handson/REST - Country Web Service/` | `GET /country` on port `8083` |
| REST - Get Country By Code | `Week 4/2.Spring-Rest-Handson/REST - Get country based on country code/` | `GET /countries/{code}` on port `8083` |
| Account Microservice | `Week 4/2 Microservices with API gateway/Creating Microservices for account and loan/account/` | `GET /accounts/{number}` on port `8080` |
| Loan Microservice | `Week 4/2 Microservices with API gateway/Creating Microservices for account and loan/loan/` | `GET /loans/{number}` on port `8081` |
| JWT Authentication Service | `Week 4/5. JWT-Handson/Create authentication service that returns JWT/` | `GET /authenticate` on port `8090` |

## React Exercises

| Exercise | Folder | Run Command |
|----------|--------|-------------|
| My First React App | `Week 5/React/ReactJs-HOL/myfirstreact/` | `npm install` then `npm run dev` |
| Student Management Portal | `Week 5/React/ReactJs-HOL/StudentApp/` | `npm install` then `npm run dev` |
| Score Calculator App | `Week 5/React/ReactJs-HOL/scorecalculatorapp/` | `npm install` then `npm run dev` |
| Blog App | `Week 5/React/ReactJs-HOL/blogapp/` | `npm install` then `npm run dev` |
| Cohort Dashboard Styling | `Week 5/React/ReactJs-HOL/cohortdashboard/` | `npm install` then `npm run dev` |

## Project Types

- **IntelliJ modules** - open the required subfolder in IntelliJ and run the main class.
- **Maven projects** - run `mvn compile` and then `mvn exec:java` with the correct main class.
- **Spring Boot projects** - run `mvn spring-boot:run` from the individual project folder.
- **React projects** - run `npm install` once, then `npm run dev` and open `http://localhost:3000`.
- **Output files** - each completed exercise keeps its console output inside an `output/` folder.
