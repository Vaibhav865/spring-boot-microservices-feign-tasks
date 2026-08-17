package com.proj.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
		
		public String checkPrime(Integer n) {

			for(int i = 2 ; i<n/2 ; i++) {
				if(n%i == 0) {					
					return "not a prime";
				}
			}
			return "its a prime";
		}
	
}
