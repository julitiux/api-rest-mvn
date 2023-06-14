FROM openjdk:17-jdk-slim
WORKDIR /app
ADD target/api-rest-mvn.jar api-rest-mvn.jar
EXPOSE 8010
CMD java -jar api-rest-mvn.jar