package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.DuplicateEncoder;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {

    @Test
    void encode() {
        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        String input = "encode this";

        Assertions.assertEquals(")(((()(((((", duplicateEncoder.encode(input));
    }
}