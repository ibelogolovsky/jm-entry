package net.belogolovsky.calc;

import java.text.ParseException;
import java.util.regex.*;

public class Roman {
    private int value;

    public Roman(String roman) throws ParseException {
        this.value = Roman.parse(roman);
    }

    /**
     * Converts roman presentation to integer
     * 
     * @param str - contains roman presentation
     * @return corresponding integer value
     * @throws ParseException
     */
    public static int parse(String str) throws ParseException {
        int result = 0;
        Pattern pattern = Pattern.compile("^((I?X)|(IV)|(VI{0,3})|(I{1,3}))$");
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            if (m.group(2) != null) {
                result = 11 - m.group(2).length();
            } else if (m.group(3) != null) {
                result = 4;
            } else if (m.group(4) != null) {
                result = 4 + m.group(4).length();
            } else if (m.group(5) != null) {
                result = m.group(5).length();
            } else {
                throw new ParseException("Ошибка в записи римского числа", 0);
            }
        } else {
            throw new ParseException("Ошибка в записи римского числа", 0);
        }
        return result;
    }

    /**
     * Converts integer value (from 1 to 10) to roman presentation
     * @param value - integer from 1 to 10
     * @return roman presentation
     * @throws ArithmeticException
     */
    public static String toRoman(int value) throws ArithmeticException {
        String result = "";
        if (value == 0) {
            result = "0";
        } 
        if (value < 0) {
            result = "-";
            value = -value;
        }
        String[] letters = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        int n = numbers.length;
        int i = 0;
        while (value > 0) {
            if (value >= numbers[i]) {
                result += letters[i];
                value -= numbers[i];
            } else {
                i++;
            }
        }
        return result;
    }

    public int getValue() {
        return this.value;
    }
}
