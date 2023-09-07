## Spring swagger example  ##

The aim of this project is to provide a example of a classic Spring MVC project, not Spring Boot, with Swagger configuration


### Description

This has been tested using Tomcat 9.0.80 /JDK 1.8. With deployed war file from the project.

The service itself is pretty basic, it is composed of a couple of examples from forums.

A single Controller with a single Model,  and in case of success the view redirects to a second path in the same controller.


### Swagger

What we achieve: Without modifying the business logic we added the ability to query 


http://localhost:8080/spring_mvc_example_war/swagger-ui.html#/home-controller

to receive a small summary of the api used, of course this can be enriched annotating the controllers as per swagger documentation and the headers using Swagger Config class

#### Components: 
* pom.xml swagger dependencies
* SwaggerConfig Class
* "override" addResourceHandlers method in WebMvcConfiguration