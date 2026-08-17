package com.proj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class controller {
			
		@Value("${server.port}")
		private int port;
		
		@Value("${eureka.instace.instace-id}")
		private String instaceof;
	
		@GetMapping("/info")
		public String getOrderInfo() {
			return "port:: "+port+ "InstaceId:: "+instaceof +" Order :: Product = phone , Price = $453";
		}
	
}
