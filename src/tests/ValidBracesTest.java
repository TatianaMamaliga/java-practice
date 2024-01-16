package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.ValidBraces;

import static org.junit.jupiter.api.Assertions.*;

class ValidBracesTest {

    @Test
    void isValid() {
        Assertions.assertFalse(ValidBraces.isValid("([{}]"));
        Assertions.assertTrue(ValidBraces.isValid("[{}]()"));
    }
}