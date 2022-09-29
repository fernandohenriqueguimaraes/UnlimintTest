package com.example.UnlimintTest.dto;

import com.example.UnlimintTest.util.ValidatorHelper;

public class OrderDTO {

    private String orderId;
    private String amount;
    private String currency;
    private String comment;
    private String fileName;
    private Integer line;
    private String result;

    public OrderDTO(String orderId, String amount, String currency, String comment, String fileName, Integer line) {
        setOrderId(orderId);
        setAmount(amount);
        setCurrency(currency);
        setComment(comment);
        setFileName(fileName);
        setLine(line);
        setResult(ValidatorHelper.validateFields(orderId, amount, currency, comment));
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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
