package com.example.rabbittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;

//@EnableRabbit
@SpringBootApplication
public class RabbittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbittestApplication.class, args);
	}

}
