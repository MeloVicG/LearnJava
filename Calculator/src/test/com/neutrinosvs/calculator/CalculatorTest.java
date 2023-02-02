package com.neutrinosvs.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test // used as a hint/metadata/
    public void canAddZeroPlusZero() {
        Calculator calc = new Calculator();
        int sum = calc.add(1, 3);
        assertEquals(4, sum, "was expecrting sum of 0"); // we are assuming sum == 0 ( expected, actual )

    }
}
