FROM maven:3.8.5-openjdk-17 AS build

# Loyihani yuklab olish
COPY . .

# Maven bilan jar faylini yaratish (testlarni o'tkazmaslik)
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim

# Yaratilgan jar faylini konteynerga nusxalash
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Portni ochish
EXPOSE 8080

# Jar faylini ishga tushirish
ENTRYPOINT ["java", "-jar", "demo.jar"]
