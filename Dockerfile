FROM gradle:jdk21-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM eclipse-temurin:21-jdk-alpine

EXPOSE 8082

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/resource-server.jar /app/resource-server.jar

ENTRYPOINT ["java","-jar","/app/resource-server.jar"]