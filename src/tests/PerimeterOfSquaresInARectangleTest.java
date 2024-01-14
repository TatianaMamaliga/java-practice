package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.PerimeterOfSquaresInARectangle;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PerimeterOfSquaresInARectangleTest {

    @Test
    void getPerimeter() {
        PerimeterOfSquaresInARectangle perimeterOfSquaresInARectangle = new PerimeterOfSquaresInARectangle();
        Assertions.assertEquals(BigInteger.valueOf(216), perimeterOfSquaresInARectangle.getPerimeter(BigInteger.valueOf(7)));
        Assertions.assertEquals(BigInteger.valueOf(80), perimeterOfSquaresInARectangle.getPerimeter(BigInteger.valueOf(13575)));
    }
}