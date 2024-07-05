package edu.hsai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CtgTest extends CalculatorTest{
    @Test
    void testCtgForZero() {
        assertEquals(0.0, calculator.ctg(0.0));
    }

    @Test
    void testCtgForPositiveAngle() {
        double angle = Math.PI / 6;
        double expectedCtg = 0.4804727781564516;
        assertEquals(expectedCtg, calculator.ctg(angle), DELTA);
    }

    @Test
    void testCtgForNegativeAngle() {
        double angle = -Math.PI / 4;
        double expectedCtg = -0.6557942026326724;
        assertEquals(expectedCtg, calculator.ctg(angle), DELTA);
    }

    @Test
    void testCtgForLargePositiveAngle() {
        double angle = Math.PI * 1000;
        assertEquals(1, calculator.ctg(angle), DELTA);
    }

    @Test
    void testCtgForLargeNegativeAngle() {
        double angle = -Math.PI * 1000;
        assertEquals(-1, calculator.ctg(angle), DELTA);
    }

    @Test
    void testCtgForSpecialCases() {
        assertEquals(0.9171523356672744, calculator.ctg(Math.PI / 2), DELTA);
        assertEquals(-0.9171523356672744, calculator.ctg(-Math.PI / 2), DELTA);
    }


}
