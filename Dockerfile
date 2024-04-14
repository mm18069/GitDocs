FROM openjdk:17
COPY source dest
ENTRYPOINT [ "java", "-jar", "java-app.jar" ]