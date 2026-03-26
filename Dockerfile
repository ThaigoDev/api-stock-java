FROM maven:4.0.0-rc-5-ibm-semeru-21-noble AS build
WORKDIR ./build

COPY . .
RUN mvn clean package -DskipTests

#run
FROM ibm-semeru-runtimes:open-21-jre
WORKDIR /app

COPY --from=build /build/target/*.jar app.jar

EXPOSE 8080

ENV DATASOURCE_URL = ''
ENV DATASOURCE_USERNAME = ''
ENV DATASOURCE_PASSWORD = ''
ENV SPRING_PROFILES_ACTIVE = production
ENV GOOGLE_CLIENT_ID = ''
ENTRYPOINT java -jar app.jar