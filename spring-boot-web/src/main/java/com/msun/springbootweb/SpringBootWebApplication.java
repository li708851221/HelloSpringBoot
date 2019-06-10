package com.msun.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.msun.springbootweb.mapper")
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
