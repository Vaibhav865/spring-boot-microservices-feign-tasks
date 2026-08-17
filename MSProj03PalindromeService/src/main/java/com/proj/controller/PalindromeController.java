package com.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proj.service.IService;

@RestController
public class PalindromeController {
		
	@Autowired
	private IService service;
	
	
	
	@GetMapping("/palindrome/{n}")
	public ResponseEntity<String> showPalindrome(@PathVariable int n ){
		return new ResponseEntity<String> (service.isPalindrome(n), HttpStatus.OK);
	}
}
