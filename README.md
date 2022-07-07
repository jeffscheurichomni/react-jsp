# react-jsp
An example of Spring Boot application that uses an embedded tomcat and jsp.  React is being integrated through create-react-app

## How to run this application

### Extract project

clone this repository into a directory on your local machine

### Build & start application

Go to the project location:

```bash
cd /path/to/project/location
```

Option 1:
Create war and execute
./mvnw clean package

To start application:
java -jar target/springbootjsp-0.0.1-SNAPSHOT.war

Option 2(better for development):
./mvnw spring-boot:run
    enables hot reload