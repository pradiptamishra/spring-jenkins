package com.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger  logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		
		logger.info("Test case executing ......");	
		logger.info("Test case executing 3rd time ......");	
		assertEquals(true, true);
	}
	
	@Test
	void missingElementTest() {
		logger.info("missingElementTest ......");	
		int[] ints= {4,3,1,5,2,10,9,8,7,6,11,12,14,15,16,17,18,19};
		SpringJenkinsApplication app= new SpringJenkinsApplication();
		assertEquals(13,app.missingElement(ints));
	}


}
