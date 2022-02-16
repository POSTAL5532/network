FROM openjdk:11
COPY build/libs/network-messages-0.0.1-SNAPSHOT.jar /network-messages/network-messages.jar
WORKDIR /network-messages
CMD ["java","-jar","network-messages.jar"]
EXPOSE 8083