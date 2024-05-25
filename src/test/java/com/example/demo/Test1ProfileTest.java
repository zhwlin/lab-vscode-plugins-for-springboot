package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@ActiveProfiles("test1")
@Slf4j
class Test1ProfileTest {

	
	@Value("${test.hello}")
	String helloValue;

	@Resource
	Environment env;

	@Test
	void test_check_hellovalue_isnotnull() {
		log.info("test.hello => {}", helloValue);
		Assertions.assertThat(helloValue).isEqualTo("test-1");
		
	}

	@Test
	void test_check_additional_value_isnnull() {
		Optional<String> additVal = Optional.ofNullable(env.getProperty("test.additional"));
		assertFalse(additVal.isPresent());
	}
	

	
}
