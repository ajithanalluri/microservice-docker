#From openjdk:8
#copy ./target/employee-producer-0.0.1-SNAPSHOT.jar employee-producer-0.0.1-SNAPSHOT.jar
#CMD ["java","-jar","employee-producer-0.0.1-SNAPSHOT.jar"]

####Fat - Image -> try with plugin in pom to reduce size

# FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

# COPY pom.xml /build/
# COPY src /build/src/

# WORKDIR /build/
# RUN mvn package

# FROM openjdk:8-jre-alpine

# WORKDIR /app

# COPY --from=MAVEN_BUILD /build/target/*.jar eshop-messaging-service.jar

# ENTRYPOINT ["java", "-jar", "eshop-messaging-service.jar"]

FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8001
