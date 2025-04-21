# Etapa 1: Construcción
FROM maven:3.8.4-openjdk-17 AS builder

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar los archivos del proyecto al contenedor
COPY pom.xml .
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR generado desde la etapa de construcción
COPY --from=builder /app/target/microservicio.jar microservicio.jar

# Exponer el puerto en el que funciona el servicio
EXPOSE 8080

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "microservicio.jar"]
