package com.example.FraudService;


public class FraudResponseDto {
    private String message;
    private boolean isFraud;

    public FraudResponseDto(String message, boolean isFraud) {
        this.message = message;
        this.isFraud = isFraud;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public void setFraud(boolean fraud) {
        isFraud = fraud;
    }
}

