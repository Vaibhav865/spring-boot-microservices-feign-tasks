package com.proj.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PaymentService")
public interface IOrderServiceRestConsumer {
		
		@GetMapping("/order/info")
		public String fetchOrder();
	
}
