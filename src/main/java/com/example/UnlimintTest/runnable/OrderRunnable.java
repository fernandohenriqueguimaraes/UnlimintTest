package com.example.UnlimintTest.runnable;

import com.example.UnlimintTest.dto.OrderDTO;
import com.example.UnlimintTest.util.ValidatorHelper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class OrderRunnable implements Runnable{

    private String[] orderFromCSV;
    private String inputFilePath;
    private String outputFilePath;
    private Integer line;

    private ObjectMapper objectMapper = new ObjectMapper();

    public OrderRunnable(String[] orderFromCSV, String inputFilePath, String outputFilePath, Integer line) {
        setOrderFromCSV(orderFromCSV);
        setInputFilePath(inputFilePath);
        setOutputFilePath(outputFilePath);
        setLine(line);
    }

    @Override
    public void run() {

        OrderDTO orderDTO = new OrderDTO(orderFromCSV[0], orderFromCSV[1], orderFromCSV[2], orderFromCSV[3], inputFilePath, line);

        try {
            objectMapper.writeValue(new PrintWriter(new BufferedWriter(new FileWriter(Paths.get(outputFilePath).toFile(),
                            true))), orderDTO.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String[] getOrderFromCSV() {
        return orderFromCSV;
    }

    public void setOrderFromCSV(String[] orderFromCSV) {
        this.orderFromCSV = orderFromCSV;
    }

    public String getInputFilePath() {
        return inputFilePath;
    }

    public void setInputFilePath(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public void setOutputFilePath(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }
}
