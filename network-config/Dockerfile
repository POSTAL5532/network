FROM openjdk:11
COPY build/libs/network-config-0.0.1-SNAPSHOT.jar /network-config/network-config.jar
WORKDIR /network-config
CMD ["java","-jar","network-config.jar"]
EXPOSE 8761