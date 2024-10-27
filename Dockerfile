FROM openjdk:17
EXPOSE 8080
ADD target/nutrition-calculator-images.jar nutrition-calculator-images.jar
ENTRYPOINT ["java", "-jar", "nutrition-calculator-images.jar"]