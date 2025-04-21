# sistema-Jairo-Fernando-Vargas-devops


## **Descripción del Proyecto**
Este proyecto integra todo lo aprendido en las evaluaciones previas, desarrollando un sistema educativo distribuido con microservicios. Incluye pruebas unitarias, monitoreo, seguridad, despliegue y un pipeline automatizado CI/CD. Se puede ejecutar localmente utilizando Docker Compose y está versionado en GitHub.

---

## **Objetivos**
1. Implementar microservicios reutilizando las soluciones del parcial 2.
2. Configurar comunicación entre microservicios mediante Feign y Eureka.
3. Proteger el sistema con seguridad JWT.
4. Realizar pruebas unitarias e integración con Mockito y WebTestClient.
5. Automatizar el ciclo de vida del sistema con GitHub Actions.
6. Monitorear el sistema usando Actuator, Prometheus y Grafana.
7. Desplegar el sistema en Docker utilizando Docker Compose.

---

## **Estructura del Proyecto**
La estructura del proyecto se organiza en las siguientes carpetas:
- `/usuarios-servicio`: Gestión de usuarios y autenticación.
- `/asignaturas-servicio`: Administración de asignaturas.
- `/matriculas-servicio`: Registro y manejo de matrículas.
- `/eureka-server`: Servidor de descubrimiento.
- `/config-server`: Servidor de configuración (opcional).

---

## **Requisitos Previos**
1. **Software necesario**:
   - Docker y Docker Compose instalados.
   - MongoDB instalado y configurado.
   - Maven para la gestión de dependencias.
2. **Entornos configurados**:
   - Java 11+ instalado.
   - Git configurado para el manejo de repositorios.
3. **Herramientas adicionales**:
   - Postman para pruebas de API.
   - Prometheus y Grafana (opcional para monitoreo avanzado).

---

## **Pasos para Desarrollar y Ejecutar el Sistema**

### **1. Planificación y Organización**
1. Crear un repositorio en GitHub llamado: `sistema-[nombre]-devops`.
2. Clonar el repositorio y crear las siguientes carpetas:
   ```
   /usuarios-servicio
   /asignaturas-servicio
   /matriculas-servicio
   /eureka-server
   /config-server (si aplica)
   /gateway-servicio (opcional)
   ```

### **2. Desarrollo de Microservicios**
1. Reutilizar los microservicios desarrollados en el parcial 2.
2. Configurar cada microservicio para que:
   - Funcione de forma aislada y tenga su propio archivo `application.properties`.
   - Use puertos independientes (ej. usuarios: 8081, asignaturas: 8082, matrículas: 8083).
   - Mantenga una conexión independiente con bases de datos MongoDB.


### **3. Comunicación entre Microservicios**
1. Implementar Feign Clients para habilitar la comunicación entre servicios.
2. Validar la comunicación con Postman simulando operaciones completas.


### **4. Configuración y Descubrimiento**
1. Implementar un servidor Eureka para el descubrimiento de servicios.
2. Configurar un servidor de configuración (opcional) con repositorio de configuración alojado en GitHub.
3. Ajustar los archivos `bootstrap.properties` en cada microservicio para conectarse al servidor de configuración.


### **5. Seguridad con JWT**
1. Implementar en `usuarios-servicio`:
   - Registro de nuevos usuarios.
   - Inicio de sesión con generación de token JWT.
   - Protección de endpoints según roles.
2. Validar la autenticación mediante Postman usando el token JWT.

### **6. Monitorización y Registro**
1. Agregar Spring Boot Actuator a cada microservicio.
2. Habilitar endpoints como:
   - `/actuator/health`
   - `/actuator/metrics`
   - `/actuator/info`
3. Configurar Prometheus y Grafana para monitoreo avanzado (opcional).

---

### **7. Pruebas Unitarias e Integración**
1. Implementar al menos 2 pruebas unitarias por microservicio utilizando Mockito.
2. Realizar al menos 1 prueba de integración con WebTestClient.
3. Validar el sistema completo mediante Postman y capturar evidencias.


### **8. Pipeline CI/CD**
1. Configurar GitHub Actions para automatizar la ejecución de pruebas al realizar un `push`.
   - En `.github/workflows/test.yml`, agregar comandos como:
     ```yaml
     name: CI/CD Pipeline
     on:
       push:
         branches:
           - main
     jobs:
       test:
         runs-on: ubuntu-latest
         steps:
           - uses: actions/checkout@v2
           - name: Set up JDK 11
             uses: actions/setup-java@v2
             with:
               java-version: '11'
           - name: Build and Test
             run: mvn test
     ```
2. Verificar que el pipeline funcione correctamente.


### **9. Despliegue con Docker**
1. Crear un archivo `Dockerfile` para cada microservicio.
2. Configurar un archivo `docker-compose.yml` que levante:
   - Los microservicios: `usuarios-servicio`, `asignaturas-servicio`, `matriculas-servicio`.
   - MongoDB para las bases de datos.
   - Eureka Server y Config Server (si aplica).
   -
3. Ejecutar el sistema con el comando:
   docker-compose up
   ```


## **Conclusión**
Este proyecto integra conceptos avanzados de DevOps y microservicios, promoviendo una arquitectura escalable y robusta. Siguiendo este README, se podrá  construir un sistema funcional 

