FROM openjdk:11
COPY build/libs/network-discovery-server-0.0.1-SNAPSHOT.jar /network-config/network-discovery-server.jar
WORKDIR /network-config
CMD ["java","-jar","network-discovery-server.jar"]
EXPOSE 8761