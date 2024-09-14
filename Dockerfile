FROM eclipse-temurin:17
COPY targer/automation.jar automation.jar
CMD ["java","-jar","automation.jar"]