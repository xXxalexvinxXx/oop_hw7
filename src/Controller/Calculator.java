package Controller;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> commands;

    public Calculator(){
        commands = new HashMap<>();
        commands.put("+", new Addition());
        commands.put("/", new Division());
        commands.put("*", new Multiplication());
        commands.put("-", new Subtraction());
    }

    public double calculate(String operator, double operand1, double operand2){
        Operation operation = commands.get(operator);
        if (operation == null){
            throw new IllegalArgumentException("Неизвестный оператор");
        }
        return operation.execute(operand1, operand2);
    }


}
