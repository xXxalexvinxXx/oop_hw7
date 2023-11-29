import Controller.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите оператор: ");
        var operator = in.nextLine();
        System.out.println("Введите операнд 1: ");
        float operand1 = in.nextFloat();
        System.out.println("Введите операнд 2: ");
        float operand2 = in.nextFloat();
        in.close();

        double answer = calculator.calculate(operator, operand1, operand2);

        System.out.println("Результат" + answer);
    }
}
