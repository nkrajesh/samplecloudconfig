# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="nkrajesh@hotmail.com"

ENV	APP_PORT=9099
ENV PASSWORD_SECRET=
EXPOSE ${APP_PORT}

# Add the application's jar to the container
COPY target/*.jar app.jar

# Run the jar file
#ENTRYPOINT ["java","-jar","-Deureka.client.registerWithEureka=true -Deureka.isntance.prefer.IpAddress=true -Deureka.client.serviceUrl=http://host.docker.internal:9091/eureka -Dspring.cloud.config.server.native.searchLocations=/var/config/","/app.jar"]
#ENTRYPOINT ["java","-jar","-Dspring.cloud.config.server.native.searchLocations=/var/config/","/app.jar"] 
ENTRYPOINT ["java","-jar","-Dserver.port=${APP_PORT}", "-Djasypt.encryptor.password=${PASSWORD_SECRET}","/app.jar"]