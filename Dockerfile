#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -Dskiptests
#
#FROM openjdk:17.0.1-jdk-slim
#
#COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java" , "-jar" , "demo.jar"]


# 1. Build qismida maven va openjdk 17 asosida konteyner yaratish
FROM maven:3.8.5-openjdk-17 AS build

# Loyihani yuklab olish
COPY . .

# Maven bilan jar faylini yaratish (testlarni o'tkazmaslik)
RUN mvn clean package -DskipTests

# 2. Openjdk 17 konteynerini yaratish
FROM openjdk:17.0.1-jdk-slim

# Yaratilgan jar faylini konteynerga nusxalash
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Portni ochish
EXPOSE 8080

# Jar faylini ishga tushirish
ENTRYPOINT ["java", "-jar", "demo.jar"]
