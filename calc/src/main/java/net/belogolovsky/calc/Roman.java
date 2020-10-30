package net.belogolovsky.calc;

import java.text.ParseException;
import java.util.regex.*;

public class Roman {
    private int value;
    public Roman(String roman) throws ParseException {
        this.value = Roman.parse(roman);
    }

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

    public int getValue() {
        return this.value;
    }
}
