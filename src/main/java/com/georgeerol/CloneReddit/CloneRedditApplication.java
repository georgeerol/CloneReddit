package com.georgeerol.CloneReddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CloneRedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloneRedditApplication.class, args);
	}

}
