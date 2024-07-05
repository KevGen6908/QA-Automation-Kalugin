package edu.hsai;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PomTest extends CalculatorTest{ // Прошу прощения я долбаеб перпектал pow c pom
    @ParameterizedTest
    @CsvSource({"1, 0, 1", "2, -1, 0.5", "2, -2.5, 0.125"})
    void simpleTest(double a, double b, double expected){
        assertEquals(expected, calculator.pow(a,b));
    }

    static Stream<Arguments> positiveInf() {
        return Stream.of(
                Arguments.arguments(1.5, Double.POSITIVE_INFINITY),
                Arguments.arguments(2, 10000),
                Arguments.arguments(Double.POSITIVE_INFINITY, 1),
                Arguments.arguments(-0, -5)
        );
    }
    @ParameterizedTest
    @MethodSource("positiveInf")
    void shouldInfinity(double a, double b){
        assertEquals(Double.POSITIVE_INFINITY, calculator.pow(a,b));
    }
}
