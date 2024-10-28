package com.springBoot3.Tala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.springBoot3.Tala.models.User;

@SpringBootApplication(scanBasePackages = { "com.springBoot3.Tala.Controllers", "com.springBoot3.Tala.Services",
		"com.springBoot3.Tala.models", "com.springBoot3.Tala.Repos" })
public class TalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalaApplication.class, args);

	}

}
