package com.proj.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MSProj02PrimeService")
public interface IFeingClient {
		
	@GetMapping("/check/{n}")
	public String check(@PathVariable int n);
	
}
