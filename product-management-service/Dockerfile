FROM openjdk:12-jdk-alpine

EXPOSE 8100
COPY ./target/product-management-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]