package com.packt.aws.books.pipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		
		assertEquals(2, 1+1);
	}
	
	@Test
	void contextLoadss() {
		
		assertNotEquals(2, 5);
	}

}
