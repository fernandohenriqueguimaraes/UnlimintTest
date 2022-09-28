package com.example.UnlimintTest.util;

public class ValidatorHelper {

    public static String validateFields (String[] orderFromCSV) {
        String result = "OK";

        if (orderFromCSV[0].isEmpty() || orderFromCSV[1].isEmpty() ||
                orderFromCSV[2].isEmpty() || orderFromCSV[3].isEmpty()) {
            result = "Process error: Empty fields.";
        } else {

            if (!orderFromCSV[0].matches("\\d+")) {
                result = "Process error: orderId is not numeric.";
            }

            if (!orderFromCSV[1].matches("\\d{1,3}[,\\\\.]?(\\\\d{1,2})?")) {
                result = "Process error: amount is not a valid number.";
            }
        }

        return result;
    }
}
