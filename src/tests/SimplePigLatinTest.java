package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.SimplePigLatin;

import static org.junit.jupiter.api.Assertions.*;

class SimplePigLatinTest {

    @Test
    void pigIt() {
        SimplePigLatin simplePigLatin = new SimplePigLatin();

        Assertions.assertEquals("hisTay siay aay esttay", simplePigLatin.pigIt("This is a test"));
    }
}