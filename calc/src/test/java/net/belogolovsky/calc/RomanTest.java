package net.belogolovsky.calc;

import static org.junit.Assert.assertThat;
// import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class RomanTest {

    @Test
    public void whenIThenOne() throws ParseException {
        int result = (new Roman("I")).getValue();
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIIThenTwo() throws ParseException {
        int result = (new Roman("II")).getValue();
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIIIThenThree() throws ParseException {
        int result = (new Roman("III")).getValue();
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIVThenFour() throws ParseException {
        int result = (new Roman("IV")).getValue();
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenVThenFive() throws ParseException {
        int result = (new Roman("V")).getValue();
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void whenVIThenSix() throws ParseException {
        int result = (new Roman("VI")).getValue();
        int expected = 6;
        assertThat(result, is(expected));
    }

    @Test
    public void whenVIIThenSeven() throws ParseException {
        int result = (new Roman("VII")).getValue();
        int expected = 7;
        assertThat(result, is(expected));
    }

    @Test
    public void whenVIIIThenEight() throws ParseException {
        int result = (new Roman("VIII")).getValue();
        int expected = 8;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIXThenNine() throws ParseException {
        int result = (new Roman("IX")).getValue();
        int expected = 9;
        assertThat(result, is(expected));
    }

    @Test
    public void whenIXThenTen() throws ParseException {
        int result = (new Roman("X")).getValue();
        int expected = 10;
        assertThat(result, is(expected));
    }

    @Test
    public void whenOneThenI() throws ArithmeticException {
        String result = Roman.toRoman(1);
        String expected = "I";
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoThenII() throws ArithmeticException {
        String result = Roman.toRoman(2);
        String expected = "II";
        assertThat(result, is(expected));
    }

    @Test
    public void whenFourThenIV() throws ArithmeticException {
        String result = Roman.toRoman(4);
        String expected = "IV";
        assertThat(result, is(expected));
    }

    @Test
    public void whenFiveThenV() throws ArithmeticException {
        String result = Roman.toRoman(5);
        String expected = "V";
        assertThat(result, is(expected));
    }

    @Test
    public void whenSevenThenVII() throws ArithmeticException {
        String result = Roman.toRoman(7);
        String expected = "VII";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNineThenIX() throws ArithmeticException {
        String result = Roman.toRoman(9);
        String expected = "IX";
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwentyFourThenXXIV() throws ArithmeticException {
        String result = Roman.toRoman(24);
        String expected = "XXIV";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNinetyThreeThenXCIII() throws ArithmeticException {
        String result = Roman.toRoman(93);
        String expected = "XCIII";
        assertThat(result, is(expected));
    }

}
