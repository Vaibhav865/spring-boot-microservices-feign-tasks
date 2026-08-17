# spring-boot-microservices-feign-tasks
Spring Boot microservices demonstrating service-to-service communication using OpenFeign for Prime Number and Palindrome Number checking.


# Spring Boot Microservices with OpenFeign

This project demonstrates communication between Spring Boot microservices using
Spring Cloud OpenFeign.

## Tasks

### Task 1 – Prime Number Checker

Two microservices are used:

- Number Service
- Prime Service

The Number Service accepts a number from the client and communicates with the
Prime Service using OpenFeign.

Flow:

Client → Number Service → Feign Client → Prime Service → Response

Example:

17 → 17 is a Prime Number
20 → 20 is Not a Prime Number

### Task 2 – Palindrome Number Checker

Two microservices are used:

- Number Service
- Palindrome Service

The Number Service accepts a number and uses OpenFeign to communicate with the
Palindrome Service.

Flow:

Client → Number Service → Feign Client → Palindrome Service → Response

Example:

121 → 121 is a Palindrome Number
123 → 123 is Not a Palindrome Number

## Technologies Used

- Java
- Spring Boot
- Spring Cloud OpenFeign
- REST APIs
- Maven
- Git/GitHub

## Key Concepts

- Microservices Architecture
- Inter-service Communication
- OpenFeign
- REST APIs
- Service-to-Service Communication
- Spring Boot
