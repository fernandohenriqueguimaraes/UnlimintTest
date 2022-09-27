package com.example.UnlimintTest;

import com.example.UnlimintTest.service.ReadCSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;

@SpringBootApplication
public class UnlimintTestApplication implements CommandLineRunner {

	@Autowired
	private ReadCSVService readCSVService;

	public static void main(String[] args) {
		SpringApplication.run(UnlimintTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws FileNotFoundException {
		String inputFilePath = args[0];
		String outputFilePath = args[1];

		readCSVService.read(inputFilePath);
 	}
}
