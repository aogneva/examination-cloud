# examination-cloud

This project is simple Spring Cloud example based on webinar https://www.youtube.com/watch?v=4hYeX2WVt68  

Project consists of four modules.

# exam-discovery  
This is a registering module, based on Eureca. It helps to register microservices and then find each other in order to commenicate.

# exam-historic  
This microservice provides the examination questions on history theme.

# exam-math  
This microservice provides the examination questions of math subject.

# examinator  
This microservice provides common endpoint to get exam questions.  
It refers to exam-math and exam-historic to get questions. 

