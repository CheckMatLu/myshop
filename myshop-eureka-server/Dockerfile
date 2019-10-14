FROM openjdk:12-jdk-alpine

EXPOSE 8761
COPY ./target/myshop-eureka-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]