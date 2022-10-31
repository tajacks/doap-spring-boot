# -- Compile & Build -- #
FROM maven:3.8.6 AS builder

# Bring Source Code & POM to Maven Container
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

# Build our JAR
RUN mvn -DskipTests -f /usr/src/app/pom.xml clean package


# -- Run JAR -- #
FROM amazoncorretto:17.0.5

# Copy JAR from build container
COPY --from=builder /usr/src/app/target/doap-spring-boot-1.0.0.jar /usr/app/

# Run SpringBoot application
ENTRYPOINT ["java","-jar","/usr/app/doap-spring-boot-1.0.0.jar"]