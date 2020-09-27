package com.jenkin.api;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger  logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started......");
	}

	public static void main(String[] args) {
		logger.info("Application executed......");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}
    
	public int missingElement(int[] A) {
        
        Arrays.sort(A);      
        int i = 0;
        while (i < A.length) {
            if (A[i] != i + 1)
                return i + 1;
            i++;
        }

        return i;
    }
	
}
