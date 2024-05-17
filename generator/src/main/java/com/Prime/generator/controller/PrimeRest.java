package com.Prime.generator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prime.generator.service.PrimeService;

@RestController
@RequestMapping("/api")
public class PrimeRest {
	
	@Autowired
	private PrimeService service;
	
	@GetMapping("/primes/{start}/{end}")
	public List<Integer> getPrimes(@PathVariable int start,@PathVariable int end){
		 return service.getPrimes(start,end);
	}
}
