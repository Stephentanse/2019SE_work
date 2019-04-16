package com.example.springdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class Springdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo2Application.class, args);
	}
	public static String hello() {
		return "com.example.springdemo2.hello";
	}
};
