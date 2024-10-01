package com.example.FraudService;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FraudService {
    private List<String> blacklistedCards = Arrays.asList(
            "1234567890123456",
            "9876543210987654",
            "1111222233334444"
    );

    public FraudResponseDto checkCard(String cardNumber) {
        boolean isFraud = blacklistedCards.contains(cardNumber);
        String message = isFraud ? "La tarjeta está en la lista negra." : "La tarjeta es válida.";
        return new FraudResponseDto(message, isFraud);
    }
}
