FROM openjdk
EXPOSE 8081
ADD target/MAC_Docker-CI-CD-Actions-Test.jar MAC_Docker-CI-CD-Actions-Test.jar
ENTRYPOINT ["java","-jar","MAC_Docker-CI-CD-Actions-Test.jar"]