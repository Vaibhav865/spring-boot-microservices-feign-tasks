package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proj.feignclient.IFeingClient;

@RestController
public class FeingController {
		
		@Autowired
		private IFeingClient client;
		
		@GetMapping("/prime/{n}")
		public ResponseEntity<String> check(@PathVariable Integer n){
			return new ResponseEntity<String> (client.check(n) , HttpStatus.OK);
		}
		
		
	
}
