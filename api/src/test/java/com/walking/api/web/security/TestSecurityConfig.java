package com.walking.api.web.security;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestSecurityConfig {

	@Bean
	public TestTokenUserDetailsService testTokenUserDetailsService() {
		return new TestTokenUserDetailsService();
	}
}
