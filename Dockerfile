# Final stage
FROM openjdk:8-jre-alpine
ENV MAVEN_OPTS=""

WORKDIR /app
COPY target/*.jar /app/app.jar

EXPOSE 8080/tcp

ENTRYPOINT java -jar $MAVEN_OPTS /app/app.jar
