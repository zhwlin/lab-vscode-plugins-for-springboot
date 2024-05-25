package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@ActiveProfiles("test")
@Slf4j
class TestProfileTest {
    
	@Value("${test.hello}")
	String helloValue;

	@Test
	void test_check_hellovalue_isnotnull() {
		log.info("test.hello => {}", helloValue);
		assertNotNull(helloValue);
		assertEquals(helloValue, "world");
	}

	
}
