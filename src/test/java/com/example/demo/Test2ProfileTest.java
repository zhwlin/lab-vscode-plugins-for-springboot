package com.example.demo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@ActiveProfiles({"test2", "test2-1"})
@Slf4j
class Test2ProfileTest {
    
	@Value("${test.hello}")
	String helloValue;

	@Value("${test.additional}")
	String additVal;

	@Test
	void test_check_hellovalue_isnotnull() {
		log.info("test.hello => {}", helloValue);
		Assertions.assertThat(helloValue).isEqualTo("test2");
	}

	@Test
	void test_check_additional_value_isnotnull() {
		log.info("test.additional => {}", additVal);
		Assertions.assertThat(additVal).isEqualTo("2-1");
	}
	
}
