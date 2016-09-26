https://spring.io/guides/gs/rest-service/

Here is a sample code which can be used for spring development.

Download the source and go to the complete folder

First install sudo apt-get install maven

Then in the complete folder run 

mvn clean install

Then you will get a jar file
run the jar file

java -jar target/gs-rest-service-0.1.0.jar

open the link as http://localhost:8080/greeting

and http://localhost:8080/greeting?name=Rishi

See the code running.

Now just have to write the REST interface

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/greeting
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X PUT http://localhost:8080/product
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"username":"xyz","password":"xyz"}' http://localhost:8080/postpost
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X PUT -d '{"username":"xyz","password":"xyz"}' http://localhost:8080/postpost
