**Application Project**

***Ramona Tigan***

Project Name: university-app
Architecture Style: 3-tier Architecture
Technologies used: Java Persistence API, JDBC API, Java Naming and Directory Interface, Enterprise Java Beans

The university-app application helps manage the database of a university by providing the following functionalities: managing students and professors, managing information about semesters, courses and schedules providing a way for professors to schedule courses and for students to attend.
The application allows users to access these functions by providing API endpoints that receive customized data in order to execute the required functionalities.

The application uses a 3-layered architecture, with the following layers:

Data Access Layer (Repository), which provides a connection between the application and the PostgreSQL database, using an ORM (Hibernate)
Business Logic Layer (Service), which provides the logic for all the CRUD operations
Presentation Layer (Controller/API), which provides the endpoints that allow the Business Logic to be accessed with external requests The application also makes use of a Messaging Framework (RabbitMQ) to notify a different application by the name of university-notification whenever a new schedule is created. The Java Messaging Service (JMS) API allows these notifications to get sent to a RabbitMQ queue from which they will be sent asynchronously to the notification application. If the notification application is not running, these messages will be memorized in the queue waiting to get sent.

In order to use the university-app application, the user must send a request to the API using the provided URLs, for example by using Postman. This request, which may contain a DTO, is received by a Controller and sent to its respective Service in order to be processed. Once the request is processed it will communicate with the Repository through an entity object and perform the necessary actions on the database. Once everything is executed the user will receive a message in the form of JSON object if the transaction was successful or an error code if something wrong occurred.

