package net.belogolovsky.calc;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ParseTest {
    @Test
    public void testOnePlusOne() {
        Parse parse;
        try {
            parse = new Parse("1 + 1");
            int op1 = parse.getOp1();
            int op2 = parse.getOp2();
            char operator = parse.getOperator();
            assertTrue(op1 == 1);
            assertTrue(op2 == 1);
            assertTrue(operator == '+');
            } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
