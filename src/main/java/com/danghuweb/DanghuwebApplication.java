package com.danghuweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.danghuweb.dao")
@SpringBootApplication
public class DanghuwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanghuwebApplication.class, args);
	}

}
