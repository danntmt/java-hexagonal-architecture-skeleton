FROM eclipse-temurin:21-jdk-alpine as build
WORKDIR /workspace/app

# Copy Maven files
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY core/pom.xml core/
COPY application/pom.xml application/
COPY infrastructure/pom.xml infrastructure/
COPY api/pom.xml api/

# Create empty source directories to optimize Maven build
RUN mkdir -p core/src/main/java
RUN mkdir -p application/src/main/java
RUN mkdir -p infrastructure/src/main/java
RUN mkdir -p api/src/main/java

# Download all required dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY core/src core/src
COPY application/src application/src
COPY infrastructure/src infrastructure/src
COPY api/src api/src

# Build the application
RUN ./mvnw package -DskipTests

FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
WORKDIR /app

# Copy the built JAR file
COPY --from=build /workspace/app/api/target/*.jar app.jar

# Set environment variables
ENV SPRING_PROFILES_ACTIVE=prod

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"] 