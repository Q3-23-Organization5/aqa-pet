package homework6;

public class CalculatorMain {
    public static void main(String[] args) {
        homework6.Calculator calculator = new homework6.Calculator();
        calculator.sum(10,20);
        calculator.substraction(30,20);
        calculator.mult(5,20);
        calculator.div(50,10);
        System.out.printf("You are welcome!");
    }
}