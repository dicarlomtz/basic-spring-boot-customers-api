# Basic Spring Boot API - Customers
The purpose of this app is to bring into practice basic spring-boot related concepts by building a basic api for customers with basic information

## Requirements:
- Docker Compose
- Java JDK (Java Version 17)

## How to install
- Get the docker image for postgress up and running
```
docker compose up
```
- Run a bash terminal inside the container
```
docker exec -it postgres bash
```
- In the bash terminal, connect to postgres
```
psql -U dicarlomtz
```
- Create the database and exit the bash terminal
```
CREATE DATABASE customer;
```
- Make a clean install of dependencies using maven
```
./mvnw clean install
```
- Run the app using maven
```
./mvnw spring-boot:run
```

Start using and enjoy!
