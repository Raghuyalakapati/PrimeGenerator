package com.Prime.generator.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="PrimeGenerator")
public class PrimeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private LocalDateTime timestamp;
	
	private int startRange;
	
	private int endRange;
	
	private long timeElapsed;
	
	private String algorithm;
	
	private int noOfPrimes;

	
	
	public PrimeEntity(){}
	
	public PrimeEntity(long id , LocalDateTime timestamp,int startRange,int endRange,long timeElapsed,String algorithm,int noOfPrimes){
		this.id=id;
		this.timestamp=timestamp;
		this.startRange=startRange;
		this.endRange=endRange;
		this.timeElapsed=timeElapsed;
		this.algorithm=algorithm;
		this.noOfPrimes=noOfPrimes;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public int getStartRange() {
		return startRange;
	}
	public void setStartRange(int startRange) {
		this.startRange = startRange;
	}
	public int getEndRange() {
		return endRange;
	}
	public void setEndRange(int endRange) {
		this.endRange = endRange;
	}
	public long getTimeElapsed() {
		return timeElapsed;
	}
	public void setTimeElapsed(long timeElapsed) {
		this.timeElapsed = timeElapsed;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public int getNoOfPrimes() {
		return noOfPrimes;
	}
	public void setNoOfPrimes(int noOfPrimes) {
		this.noOfPrimes = noOfPrimes;
	}
		
}
