package com.gowthamrajk.log4jpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class LoggerDemo {

	public static final Logger logger = Logger.getLogger(LoggerDemo.class);
	
	public static void main(String[] args) {
		
//		logger.info("even numbers are logged here !!!");
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		numbers.stream().filter(num -> num % 2 == 0).forEach(val -> logger.trace(val + " "));
		
		logger.info("Vote Eligiblity Calculator : ");
		Scanner scanner = new Scanner(System.in);
		int age  =  scanner.nextInt();
		if(age >= 18)
			logger.trace("Age : " + age + " => Eligible to Vote !!!");
		else
			logger.warn("Age : " + age + " => Not Eligible to vote !!!");
		scanner.close();
	}

}
