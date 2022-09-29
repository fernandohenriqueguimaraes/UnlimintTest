package com.example.UnlimintTest.util;

public class ValidatorHelper {

    public static String validateFields (String orderId, String amount, String currency, String comment) {
        String result = "OK";

        if (orderId.isEmpty() || amount.isEmpty() ||
                currency.isEmpty() || comment.isEmpty()) {
            result = "Process error: Empty fields.";
        } else {

            if (!orderId.matches("\\d+$")) {
                result = "Process error: orderId is not numeric.";
            }

            if (!amount.matches("[0-9]+([,.][0-9]{1,2})?$")) {
                result = "Process error: amount is not a valid number.";
            }
        }

        return result;
    }
}
