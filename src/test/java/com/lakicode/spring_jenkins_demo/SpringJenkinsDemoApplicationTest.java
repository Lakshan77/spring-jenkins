package com.lakicode.spring_jenkins_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTest {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTest.class);

	@Test
	void test() {
		logger.info("Test Case Executing....");
		assertEquals(true, true);
	}

}
