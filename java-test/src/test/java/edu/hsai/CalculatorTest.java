package edu.hsai;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
    protected static Calculator calculator;
    public static final double DELTA = 1.e-5;

    @BeforeAll
    static void init(){
        calculator = new Calculator();
    }

}
