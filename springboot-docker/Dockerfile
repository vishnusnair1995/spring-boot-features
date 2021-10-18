FROM openjdk:8
ADD target/docker-springboot.jar docker-springboot.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-springboot.jar"]