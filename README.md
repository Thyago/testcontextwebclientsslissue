# Spring Boot Test Context + WebClientSsl Issue

This project is a sample Spring Boot intended to simulate an issue found between Spring Boot versions 3.1.0 (when 
WebClientSsl was introduced) and version 3.3.1.
This project was created to simulate the issue described in the Spring Boot ticket #41545

UPDATE: It seems that in Spring Boot version 3.3.2, the issue was fixed with the ticket #39199. 


## The Issue

When using the WebClientSsl configuration in a Spring Boot application, the WebClient will fail with a 
WebClientRequestException and the message "event executor terminated". This issue is present when the WebClient tests
are executed after the 32 Test Contexts are created.


## Running

Run the TestSuiteTest.java tests.
The Suite contains a list of 32 simple tests, each one initializing a unique Test Context by just having @SpringBootTest with a different property value.
And the WebClient test, which fails only if the 32 contexts were initialized before.


## References

WebClientSsl documentation: https://docs.spring.io/spring-boot/api/java/org/springframework/boot/autoconfigure/web/reactive/function/client/WebClientSsl.html

Spring Boot Ticket #41545: https://github.com/spring-projects/spring-boot/issues/41545

Spring Boot Ticket #39199: https://github.com/spring-projects/spring-boot/issues/38199
