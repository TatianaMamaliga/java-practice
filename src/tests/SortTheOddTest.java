package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.SortTheOdd;

import static org.junit.jupiter.api.Assertions.*;

class SortTheOddTest {

    @Test
    void sortArray() {
        int[] input = {2, 4, 3, 7, 9, 6, 5};
        int[] expectedOutput = {2, 4, 3, 5, 7, 6, 9};

        SortTheOdd sortTheOdd = new SortTheOdd();
        int[] actualOutput = sortTheOdd.sortArray(input);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}