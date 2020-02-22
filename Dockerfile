FROM openjdk:8-jdk
ADD target/gateway.jar gateway.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "gateway.jar"]