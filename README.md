# Network

Social network project for Spring Cloud and microservices practice.

## Environment requirements
* Java 11+
* Docker
* Docker-Compose

## Running
* set application properties `.yaml` file for services (from `application.yaml.template` file)
* build project - `./gradlew clean build`
* up database container - `docker-compose up -d --build database`
* up config server container - `docker-compose up -d --build network-config-server`
* up discovery server container - `docker-compose up -d --build network-discovery-server`
* up notifications service container - `docker-compose up -d --build network-notifications`
* up posts service container - `docker-compose up -d --build network-posts`
* up users service container - `docker-compose up -d --build network-users`

## Stopping
* stop all containers - `docker-compose down`
