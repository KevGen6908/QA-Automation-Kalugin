package edu.hsai;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest extends CalculatorTest {
    @ParameterizedTest
    @CsvSource({"23, 41, 64", "52, 2, 54", "3, 7, 10"})
    void simpleTest(long a, long b, long expected){
        assertEquals(expected, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource({"9223372036854775807, 1 ,-9223372036854775808", "-9223372036854775808, -1, 9223372036854775807"})
    void difficultTest(long a, long b, long expected){
        assertEquals(expected, calculator.sum(a,b));
    }
}
