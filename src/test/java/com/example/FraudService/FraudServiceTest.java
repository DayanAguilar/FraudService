package com.example.FraudService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudServiceTest {
    private FraudService fraudService = new FraudService();

    @Test
    @DisplayName("It should be on the black list")
    public void testCheckCardInBlacklist() {
        FraudResponseDto response = fraudService.checkCard("1234567890123456");
        assertEquals("La tarjeta está en la lista negra.", response.getMessage());
        assertEquals(true, response.isFraud());
    }

    @Test
    @DisplayName("It should not be on the black list")
    public void testCheckCardNotInBlacklist() {
        FraudResponseDto response = fraudService.checkCard("5555555555554444");
        assertEquals("La tarjeta es válida.", response.getMessage());
        assertEquals(false, response.isFraud());
    }

}