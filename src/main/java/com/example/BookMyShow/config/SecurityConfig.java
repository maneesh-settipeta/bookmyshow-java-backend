package com.example.BookMyShow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
//	public SecurityFilterChain filterChain(HttpSecurity http) {
//		http.httpBasic(withDefaults());
//		return http.build();
//	}

}
