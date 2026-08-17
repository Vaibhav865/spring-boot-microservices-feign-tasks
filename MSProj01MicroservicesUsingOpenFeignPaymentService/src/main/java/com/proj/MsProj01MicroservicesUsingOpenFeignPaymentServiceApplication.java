package com.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj01MicroservicesUsingOpenFeignPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj01MicroservicesUsingOpenFeignPaymentServiceApplication.class, args);
	}

}
