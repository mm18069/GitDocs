# USO DE IMAGEN DE MAVEN
FROM maven:3.9.6-eclipse-temurin-17-focal as build
WORKDIR /app
# PASAR COD FUENTE AL CONTENEDOR
COPY ./src /app/src
COPY ./pom.xml /app
# COMPILACION
RUN mvn clean package -DskipTests

# EJECUCION DE JDK
FROM openjdk:17-oracle
WORKDIR /app
# COPIAS JAR DESDE EL CONTENEDOR AL COMPILADOR
COPY --from=build /app/target/*.jar app.jar
# EJECUCION DE LA APP
CMD ["java", "-jar", "app.jar"]
EXPOSE 8080
