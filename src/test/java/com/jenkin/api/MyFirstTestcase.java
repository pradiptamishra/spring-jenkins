package com.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyFirstTestcase {

	@Test
	void missingElementTest() {
		//fail("Not yet implemented");
		int[] ints= {4,3,1,5,2,10,9,8,7,6,11,12,14,15,16,17,18,19};
		SpringJenkinsApplication app= new SpringJenkinsApplication();
		assertEquals(13,app.missingElement(ints));
	}

}
