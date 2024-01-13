package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.StringEndsWith;

import static org.junit.jupiter.api.Assertions.*;

class StringEndsWithTest {
    String strInput = "elephant";
    String strEnding = "ant";
    String strEndingWrong = "nant";

    @Test
    void firstSolution() {
        StringEndsWith stringEndsWith = new StringEndsWith();
        boolean actualOutput = stringEndsWith.firstSolution(strInput, strEnding);
        boolean actualOutputTwo = stringEndsWith.firstSolution(strInput, strEndingWrong);
        assertTrue(actualOutput);
        assertFalse(actualOutputTwo);
    }

    @Test
    void secondSolution() {
        StringEndsWith stringEndsWith = new StringEndsWith();
        boolean actualOutput = stringEndsWith.secondSolution(strInput, strEnding);
        boolean actualOutputTwo = stringEndsWith.secondSolution(strInput, strEndingWrong);
        assertTrue(actualOutput);
        assertFalse(actualOutputTwo);
    }
}