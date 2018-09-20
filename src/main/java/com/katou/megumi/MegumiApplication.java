package com.katou.megumi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.katou.megumi.dao")
@SpringBootApplication
public class MegumiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegumiApplication.class, args);
	}
}
