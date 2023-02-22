package com.michellemadeira.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrolApplication.class, args);
	}

}
