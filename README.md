# anzinterview-test

Hi ,

I have created the Rest API which will perform CRUD operation for a given requirements and used java 8 with Spring boot version 2.7.4
MySql is used as the daatbase service
Eclipse ID for code developement
Postman desktop application to test the APIs

Dependencies,
Spring Web( Spring-boot-started-web)
Spring  data jpa ( ApI using Spring data and Hibernate)
My SQL driver.
( Created required table and columns )

Run the project as Maven build and pass spring-boot:run as Goals and add the environment variable for spring datasource usernamane and password ( created while setuup of MySQL)

Test the application using Postman ( collection is provided )
POST ( insert the data )
http://localhost:8080/api/accounts

GET (to get All Data )
http://localhost:8080/api/accounts

GET ( to get Data by ID ) 
http://localhost:8080/api/accounts1/2

PUT ( to edit the data by ID )
http://localhost:8080/api/accounts/1







