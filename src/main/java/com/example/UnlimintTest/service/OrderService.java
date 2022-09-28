package com.example.UnlimintTest.service;

import com.example.UnlimintTest.dto.OrderDTO;
import com.example.UnlimintTest.util.ValidatorHelper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

@Service
public class OrderService {

    private ObjectMapper objectMapper = new ObjectMapper();

    public void process(String inputFilePath, String outputFilePath) throws IOException {

        Scanner scanner = new Scanner(new File(inputFilePath));

        Integer line = 0;

        while (scanner.hasNext()) {
            String[] orderFromCSV = scanner.nextLine().split(",");

            objectMapper.writeValue(new PrintWriter(new BufferedWriter(new FileWriter(Paths.get(outputFilePath).toFile(),
                    true))),
                    (OrderDTO.builder()
                    .orderId(orderFromCSV[0])
                    .amount(orderFromCSV[1])
                    .currency(orderFromCSV[2])
                    .comment(orderFromCSV[3])
                    .fileName(inputFilePath)
                    .line(++line)
                    .result(ValidatorHelper.validateFields(orderFromCSV)).build()).toString());
        }

        scanner.close();
    }


}
