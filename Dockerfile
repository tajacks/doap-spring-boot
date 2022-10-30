# -- Compile & Build -- #
FROM maven:3.8.6 AS builder

COPY src /usr/src/app/src

COPY pom.xml /usr/src/app

RUN mvn -DskipTests -f /usr/src/app/pom.xml clean package


# -- Run JAR -- #
FROM amazoncorretto:17.0.5

COPY --from=builder /usr/src/app/target/doap-spring-boot-1.0.0.jar /usr/app/

ENTRYPOINT ["java","-jar","/usr/app/doap-spring-boot-1.0.0.jar"]