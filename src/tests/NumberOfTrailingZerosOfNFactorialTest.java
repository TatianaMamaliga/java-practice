package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.NumberOfTrailingZerosOfNFactorial;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfTrailingZerosOfNFactorialTest {

    @Test
    void zeros() {
        int input = 12;
        int expectedOutput = 2;

        NumberOfTrailingZerosOfNFactorial zerosOfNFactorial = new NumberOfTrailingZerosOfNFactorial();
        int actualOutput = zerosOfNFactorial.zeros(input);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}