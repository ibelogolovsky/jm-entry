package net.belogolovsky.calc;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Калькулятор Принимает на вход строку формата "<Операнд1> <Операция>
 * <Операнд2>", где Операнд1 и Операнд2 - целые числа от 1 до 10 включительно
 * Операция - одна из операций: +, -, *, / Операнды могут быть заданы арабскими
 * или римскими числами одновременно
 * 
 * @author Igor Belogolovsky (igor@belogolovsky.net)
 * @version 1
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Введите выражение: ");
        String expression = new Scanner(System.in).nextLine();
        // System.out.println("The Expression is: " + expression);
        try {
            Parser parser = new Parser(expression);
            int result = Calculator.evaluate(parser.getOp1(), parser.getOp2(), parser.getOperator());
            if (parser.getRomanFlag()) {
                System.out.println("Результат: " + Roman.toRoman(result));
            } else {
                System.out.println("Результат: " + result);
            }
        } catch (ParseException | ArithmeticException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }

    }
}
