package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proj.client.IFeignClinent;

@RestController
public class Controller {
		
		@Autowired
		private IFeignClinent client;
	
		@GetMapping("/find/{n}")
		public ResponseEntity<String> showPalindrome(@PathVariable int n ){
			return new ResponseEntity<String> (client.showPalindrome(n) , HttpStatus.OK);
		}
		
}
