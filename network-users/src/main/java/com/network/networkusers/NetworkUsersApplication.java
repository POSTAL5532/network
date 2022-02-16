package com.network.networkusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetworkUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkUsersApplication.class, args);
	}

}
