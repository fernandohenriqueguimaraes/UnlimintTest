package com.example.UnlimintTest;

import com.example.UnlimintTest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class UnlimintTestApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(UnlimintTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		orderService.process(args[0], args[1]);
 	}
}
