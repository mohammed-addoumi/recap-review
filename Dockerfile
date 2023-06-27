FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/recap.jar .

CMD ["java","-jar","recap.jar"]