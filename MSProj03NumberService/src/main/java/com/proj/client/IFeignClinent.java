package com.proj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MSProj03PalindromeService")
public interface IFeignClinent {
		
		@GetMapping("/palindrome/{n}")
		public String showPalindrome(@PathVariable int n);
	
}
