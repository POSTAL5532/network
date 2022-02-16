package com.network.networkdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetworkDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkDiscoveryServerApplication.class, args);
	}

}
