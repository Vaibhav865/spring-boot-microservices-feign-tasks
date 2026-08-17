package com.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MsProj01MicroservicesUsingOpenFeignOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj01MicroservicesUsingOpenFeignOrderServiceApplication.class, args);
	}

}
