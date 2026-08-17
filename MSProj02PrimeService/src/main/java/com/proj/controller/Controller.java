package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proj.service.NumberService;

@RestController
public class Controller {
	@Autowired
	private NumberService service;
	
	@GetMapping("/check/{n}")
	public ResponseEntity<String > checkIsPrime(@PathVariable Integer n){	
		String msg = service.checkPrime(n);
		return new ResponseEntity<String>(msg , HttpStatus.OK);	
		
	}
	
	
}
