FROM openjdk:20
EXPOSE 8080
ADD target/todo-manager-1.0-SNAPSHOT.jar todo-manager.jar
ENTRYPOINT ["java", "-jar", "todo-manager.jar"]