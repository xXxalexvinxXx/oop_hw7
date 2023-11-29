package Controller;

public class Division implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 == 0){throw new IllegalArgumentException("Деление на 0 запрещено");}
        return operand1 / operand2;
    }
}
