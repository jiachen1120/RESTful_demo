# RESTful_demo
Spring Boot "Microservice" Example Project
This is a sample Java / Maven / Spring Boot application that can be used as a starter for creating a microservice complete with built-in health check, metrics and much more. I hope it helps you.

How to Run
1. Clone this repository
2. Make sure you are using JDK 1.8 and Maven 3.x
3. Run as spring boot app
4. Access `http://localhost:8080/info`

About the Service
The service is just a simple REST service. It uses MySQL database to store the data.

1. Get list of users' information including their firstname, lastname and email address by http method `GET`
2. Create new user and add it to database by http method `POST`
i.e. The request is
```
{
  "firstname" : "xxx",
  "lastname" : "xxx",
  "email" : "xxx@xxx.com",
}
```
The expected response is 
```
{
  "STATUS" : "SUCCESS",
}
```
