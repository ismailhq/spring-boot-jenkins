package com.ismail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
	
	private final Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@Test
	public contextLoads() {
		logger.info("Test logging three from test class......");
		logger.info("Test logging four from test class second time......");
		assertEquals(true, true);
	}

}
