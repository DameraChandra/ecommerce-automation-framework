# Use Maven with Java 17
FROM maven:3.9.6-eclipse-temurin-17

# Create Working Directory
WORKDIR /app

# Copy Complete Project
COPY . .

# Download Dependencies
RUN mvn clean install -DskipTests

# Run Automation Tests
CMD ["mvn", "test"]