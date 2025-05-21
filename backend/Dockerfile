FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/student-loan-portal-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
