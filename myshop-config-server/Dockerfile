#FROM openjdk:8-jdk-alpine as build
#WORKDIR /workspace/app
#VOLUME /.m2:${PWD}/.m2/repository

#COPY mvnw .
#COPY .mvn .mvn
#COPY pom.xml .
#COPY src src

#RUN ./mvnw install -DskipTests
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG DEPENDENCY=/workspace/app/target/dependency
#COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
#COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:app/lib/*","com.myshop.configserver.myshopconfigserver.MyshopConfigServerApplication"]


#----- Old way:


FROM openjdk:8-jdk-alpine

EXPOSE 8888
COPY ./target/myshop-config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom" ,"-jar" ,"/app.jar"]