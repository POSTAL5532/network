package com.network.networkconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NetworkConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkConfigApplication.class, args);
	}

}
