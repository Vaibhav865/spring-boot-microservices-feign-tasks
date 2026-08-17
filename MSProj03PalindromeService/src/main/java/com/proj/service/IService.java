package com.proj.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class IService {
	
	
		@Value("${server.port}")
		int port;
	
		public String isPalindrome(int n) {
			int rev = 0;
			int temp = n ;
			while(n > 0) {
				int digit = n%10;
				rev = rev * 10 + digit;
				n = n/10;
			}
			if(rev == n ) return temp + " is palindrome" + " "  + port;
			
			return temp +" is not a palindrome" + " "  + port;
		
		}
		
}
