package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.FakeBinary;

class FakeBinaryTest {

    @Test
    void fakeBin() {
        String input = "5472084627";
        String expectedOutput = "1010010101";

        FakeBinary fakeBinary = new FakeBinary();

        String actualOutput = fakeBinary.fakeBin(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}