FROM openjdk
EXPOSE 8081
ADD target/Medical-Records-Access-Control-Service-0.0.1-SNAPSHOT.jar Medical-Records-Access-Control-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Medical-Records-Access-Control-Service-0.0.1-SNAPSHOT.jar"]