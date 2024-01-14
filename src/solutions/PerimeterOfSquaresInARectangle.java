package solutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PerimeterOfSquaresInARectangle {
    public BigInteger getPerimeter(BigInteger n) {
        List<BigInteger> fibInteger = getFibonacciSeq(n);
        return calculatePerimeter(fibInteger);
    }

    public List<BigInteger> getFibonacciSeq(BigInteger n) {
        List<BigInteger> fibonacciSeq = new ArrayList<>();
        int i = n.intValue();

        BigInteger firstEl = BigInteger.ZERO;
        BigInteger secondEl = BigInteger.ONE;
        fibonacciSeq.add(BigInteger.ZERO);
        fibonacciSeq.add(BigInteger.ONE);

        for (int j = 1; j <= i; j++){
            BigInteger nextEl = firstEl.add(secondEl);
            firstEl = secondEl;
            secondEl = nextEl;
            fibonacciSeq.add(nextEl);
        }

        return fibonacciSeq;
    }
    public BigInteger calculatePerimeter(List<BigInteger> fibInt) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger sides = BigInteger.valueOf(4L);
        for (BigInteger n : fibInt){
            sum = sum.add(n);
        }
        return sum.multiply(sides);
    }
}