package net.belogolovsky.calc;

import java.text.ParseException;
import java.util.regex.*;

/**
 * @author Igor Belogolovsky (igor@belogolovsky.net)
 * @version $Id$
 * @since 0.1
 */

public class Parser {
    private String expression;
    private int op1;
    private int op2;
    private char operator;
    private boolean romanFlag;

    public Parser(String expression) throws ParseException {
        this.expression = expression;
        parse();
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setRomanFlag(boolean romanFlag) {
        this.romanFlag = romanFlag;
    }

    public boolean getRomanFlag() {
        return this.romanFlag;
    }

    private void parse() throws ParseException {
        Pattern pattern1 = Pattern.compile("^(1?\\d)\\s?([+\\-*/])\\s?(1?\\d)$");
        Pattern pattern2 = Pattern.compile("^(I?X|I?V|V?I{0,3})\\s?([+\\-*/])\\s?(I?X|I?V|V?I{0,3})$");
        Matcher m1 = pattern1.matcher(this.expression);
        Matcher m2 = pattern2.matcher(this.expression);
        if (m1.matches()) {
            this.setOp1(Integer.parseInt(m1.group(1)));
            this.setOperator(m1.group(2).charAt(0));
            this.setOp2(Integer.parseInt(m1.group(3)));
            this.setRomanFlag(false);
        } else if (m2.matches()) {
            this.setOp1(Roman.parse(m2.group(1)));
            this.setOperator(m2.group(2).charAt(0));
            this.setOp2(Roman.parse(m2.group(3)));
            this.setRomanFlag(true);
        } else {
            throw new ParseException("Не удалось распознать выражение", 0);
        }
        if ((this.getOp1() > 10) || (this.getOp2() > 10) || (this.getOp1() < 1) || (this.getOp2() < 1)) {
            throw new ParseException("Числа должны быть не меньше 1 и не больше 10", 0);
        }

    }

    


}
