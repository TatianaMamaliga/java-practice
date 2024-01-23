package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.ROT13Decipher;

import static org.junit.jupiter.api.Assertions.*;

class ROT13DecipherTest {

    @Test
    void rot13() {
        ROT13Decipher decipher = new ROT13Decipher();
        String input = "Hello World!";

        Assertions.assertEquals("Uryyb Jbeyq!", decipher.rot13(input));
    }
}