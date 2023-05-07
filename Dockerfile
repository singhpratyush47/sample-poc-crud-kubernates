FROM openjdk:8-jdk-alpine
EXPOSE 8082
COPY target/sample-poc-crud-0.0.1-SNAPSHOT.jar sample-poc-crud-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sample-poc-crud-0.0.1-SNAPSHOT.jar"]