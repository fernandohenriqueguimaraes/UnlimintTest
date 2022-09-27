package com.example.UnlimintTest.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
public class ReadCSVService {
    public void read (String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter(",");
        while (scanner.hasNext())
        {
            System.out.print(scanner.next());
        }
        scanner.close();
    }

}
