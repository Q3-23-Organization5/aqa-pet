package homework6;

public class Calculator {
    //    int num1, num2;
    public void sum(int num1, int num2) {
        int sumResult = num1 + num2;
        System.out.println("Sumresult is: " + sumResult);
    }

    public void substraction(int num1, int num2) {
        int subResult = num1 - num2;
        System.out.println("Result of multiplication is: " + subResult);
    }

    public void mult(int num1, int num2) {
        int multResult = num1 * num2;
        System.out.println("Result of multiplication is: " + multResult);
    }

    public void div(int num1, int num2) {
        int divResult = num1 / num2;
        System.out.println("Result of division is: " + divResult);
    }
}
