package net.belogolovsky.calc;

import static org.junit.Assert.assertThat;
// import static org.junit.Assert.assertTrue;

// import java.text.ParseException;

import static org.hamcrest.core.Is.is;

import org.junit.Test;



public class CalculatorTest {
    
    @Test
    public void whenOnePlusOneThenTwo() {
        int result = Calculator.evaluate(1, 1, '+');
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test 
    public void whenOneMinusTwoThenMinusOne() {
        int result = Calculator.evaluate(1, 2, '-');
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoMulTwoThenFour() {
        int result = Calculator.evaluate(2, 2, '*');
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whetFiveDivTwoThenTho() {
        int result = Calculator.evaluate(5, 2, '/');
        int expected = 2;
        assertThat(result, is(expected));
    }
}
