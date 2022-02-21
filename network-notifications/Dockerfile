FROM openjdk:11
COPY build/libs/network-notifications-0.0.1-SNAPSHOT.jar /network-notifications/network-notifications.jar
WORKDIR /network-notifications
CMD ["java","-jar","network-notifications.jar"]
EXPOSE 8083