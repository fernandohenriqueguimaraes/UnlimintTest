package com.example.UnlimintTest;

import com.example.UnlimintTest.runnable.OrderRunnable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class UnlimintApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UnlimintApplication.class, args);
	}

	@Override
	public void run(String... args) throws IOException {
		String inputFilePath = args[0];
		String outputFilePath = args[1];
		Integer line = 0;
		Scanner scanner = new Scanner(new File(inputFilePath));

		while (scanner.hasNext()) {

			String[] orderFromCSV = scanner.nextLine().split(",");

			Thread orderThread = new Thread(new OrderRunnable(orderFromCSV, inputFilePath, outputFilePath, line));
			orderThread.start();

		}

		scanner.close();
 	}
}
