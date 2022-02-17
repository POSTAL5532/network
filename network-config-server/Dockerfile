FROM openjdk:11
COPY build/libs/network-config-server-0.0.1-SNAPSHOT.jar /network-config-server/network-config-server.jar
WORKDIR /network-config-server
CMD ["java","-jar","network-config-server.jar"]
EXPOSE 8761