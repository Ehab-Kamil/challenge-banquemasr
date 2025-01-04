# TASK Management - challenge05

* checkout the project
* install postgres
* run the script "schema.sql" under resource/scipts to create the tables
* start the application through IDE or using Java command line
* Use below to generate token
  * URL http://localhost:8080/auth/login
  * body {"username":"ehabkamil", "password" : "password"}
  * http method as POST
  * store the token to be used in header on other requests
* Use http://localhost:8080/api/tasks

* for email notification 
  * please replace the mail.username and mail.password to real configuration to make it works
