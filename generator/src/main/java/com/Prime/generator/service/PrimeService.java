package com.Prime.generator.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Prime.generator.entity.PrimeEntity;
import com.Prime.generator.repository.PrimeRepo;

@Service
public class PrimeService {
	
	@Autowired
	private PrimeRepo repo;
	
	public List<Integer> getPrimes(int start, int end) {
		
		long startTime=System.nanoTime();

				
	    List<Integer> primes = new ArrayList<>();


        for (int i = start; i<= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        long endTime = System.nanoTime();
		
		

        logExecution(start, end, startTime, endTime, "Basic", primes.size());

        return primes;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    private void logExecution(int start, int end, long startTime, long endTime, String algorithm, int primesCount) {
        PrimeEntity record = new PrimeEntity();
        record.setTimestamp(LocalDateTime.now());
        record.setStartRange(start);
        record.setEndRange(end);
        record.setTimeElapsed(endTime-startTime);
        record.setAlgorithm(algorithm);
        record.setNoOfPrimes(primesCount);

        repo.save(record);
       }	
		
	}
