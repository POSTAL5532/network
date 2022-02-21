package com.network.networknotifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetworkNotificationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkNotificationsApplication.class, args);
	}

}
