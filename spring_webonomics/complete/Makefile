compile:
	mvn -o clean install
run: compile
	java -jar target/gs-rest-service-0.1.0.jar 

launch: run
	google-chrome http://localhost:8080/greeting
	google-chrome http://localhost:8080/greeting?name=Rishi
	google-chrome http://localhost:8080/product


