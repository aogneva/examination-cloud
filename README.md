# examination-cloud

This project is simple Spring Cloud example based on webinar [Spring-cloud goes cloud](https://www.youtube.com/watch?v=4hYeX2WVt68)

Project consists of four modules:

### exam-discovery
This is a registering module, based on Eureca. It helps to register microservices and then find each other in order to commenicate.  
Configured at port: http://localhost:8761

### exam-historic
This microservice provides the examination questions on history theme.
It includes H2 database and hasn't got questions on start.  
Configured at port: http://localhost:8081

### exam-math
This microservice provides the examination questions of math subject.
Questions are placed just inside the code.  
Configured at port: http://localhost:8082

### examinator
This microservice provides common endpoint to get exam questions.  
It refers to exam-math and exam-historic to get questions.  
Configured at port: http://localhost:8083

##Quick start
1. Start services and make sure that all the services registered in [exam-discovery](http://localhost:8761).   
1. Add historic questions through exam-historic, for example:  
`curl -X POST http://localhost:8081/questions \   
--header "Content-Type: application/json" \    
--data-raw "{\"question\": \"How many years in century?\",\"answer\":\"100\"}\"`  
1. Add math questions through exam-math.  
1. Get the questions through examinator  
`curl -X POST http://localhost:8083/exam --header "Content-Type: application/json" --data-raw "{\"MATH\":5, \"history\":2}"`