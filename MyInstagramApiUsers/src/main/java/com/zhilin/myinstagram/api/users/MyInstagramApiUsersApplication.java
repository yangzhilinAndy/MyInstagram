package com.zhilin.myinstagram.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyInstagramApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyInstagramApiUsersApplication.class, args);
	}

}
