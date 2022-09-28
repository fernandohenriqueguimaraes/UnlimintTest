package com.example.UnlimintTest.dto;

import lombok.Builder;

@Builder
public class OrderDTO {

    private String orderId;
    private String amount;
    private String currency;
    private String comment;
    private String fileName;
    private Integer line;
    private String result;

    @Override
    public String toString() {
        return "{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", comment='" + comment + '\'' +
                ", fileName='" + fileName + '\'' +
                ", line=" + line +
                ", result='" + result + '\'' +
                '}';
    }
}
