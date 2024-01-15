package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.BreakcamelCase;

import static org.junit.jupiter.api.Assertions.*;

class BreakcamelCaseTest {

    @Test
    void solution() {
        BreakcamelCase breakcamelCase = new BreakcamelCase();
        Assertions.assertEquals("total New Users", breakcamelCase.solution("totalNewUsers"));
    }
}