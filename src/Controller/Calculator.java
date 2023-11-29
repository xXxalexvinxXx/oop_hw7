package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class Calculator {
    private final Map<String, Operation> actions;

    public Calculator(){
        actions = new HashMap<>();
        actions.put("+", new Addition());
        actions.put("/", new Division());
        actions.put("*", new Multiplication());
        actions.put("-", new Subtraction());
    }

    public double calculate(String operator, double operand1, double operand2){
        Operation operation = actions.get(operator);
        if (operation == null){
            throw new IllegalArgumentException("Неизвестный оператор");
        }
      return operation.execute(operand1, operand2);
    }
}
