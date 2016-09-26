compile:
	mvn -o clean install
run: compile
	java -jar target/gs-rest-service-0.1.0.jar 

launch: run
	google-chrome http://localhost:8080/greeting
	google-chrome http://localhost:8080/greeting?name=Rishi
	google-chrome http://localhost:8080/product
	google-chrome http://localhost:8080/productDBList
	google-chrome http://localhost:8080/postuser
	google-chrome http://localhost:8080/postpost
	google-chrome http://localhost:8080/productDB

curl:
	curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/productDBList
