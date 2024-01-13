package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.DisemvowelTrolls;

class DisemvowelTrollsTest {

    @Test
    void disembowel() {
        String input = "This is awesome";
        String expectedOutput = "Ths s wsm";

        DisemvowelTrolls disemvowelTrolls = new DisemvowelTrolls();
        String actualOutput = disemvowelTrolls.disemvowel(input);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}