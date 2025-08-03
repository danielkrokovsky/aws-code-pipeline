FROM openjdk:11
ARG JAR_FILE=target/aws-code-pipeline*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080 5432
CMD ["echo" "AWS code pipeline application executed successfully!"]