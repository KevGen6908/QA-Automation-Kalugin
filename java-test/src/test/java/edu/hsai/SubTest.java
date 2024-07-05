package edu.hsai;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SubTest extends CalculatorTest{
    @ParameterizedTest
    @CsvSource({"23, 41, -18", "52, 2, 50", "3, 7, -4"})
    void simpleTest(long a, long b, long expected){
        assertEquals(expected, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({"9223372036854775807, -9223372036854775808 ,-1"})
    void difficultTest(long a, long b, long expected){
        assertEquals(expected, calculator.sub(a,b));
    }
}
