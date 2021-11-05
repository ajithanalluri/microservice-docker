
####Fat - Image -> try with plugin in pom to reduce size

# FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

# COPY pom.xml /build/
# COPY src /build/src/

# WORKDIR /build/
# RUN mvn package

# FROM openjdk:8-jre-alpine

# WORKDIR /app

# COPY --from=MAVEN_BUILD /build/target/*.jar eureka-server.jar

# ENTRYPOINT ["java", "-jar", "eureka-server.jar"]

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8761
