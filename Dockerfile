FROM eclipse-temurin:17

RUN mkdir /graphql-poc

COPY build/libs/graphql-poc-0.0.1-SNAPSHOT.jar /graphql-poc/app.jar

WORKDIR /graphql-poc

CMD ["sh", "-c", "java -Dspring.profiles.active=$JAVA_ENV -jar app.jar"]