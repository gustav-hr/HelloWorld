package Calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition of two integers = " + calculator.add(5, 10));
        System.out.println("Addition of two doubles = " + calculator.add(3.5, 4.7));
        System.out.println("Addition of three integers = " + calculator.add(1, 2, 3));
        System.out.println("Multiplication of two integers = " + calculator.multiply(5, 6));
        System.out.println("Multiplication of two doubles = " + calculator.multiply(3.5, 2.0));
        System.out.println("Division of integers = " + calculator.divide(10, 2));

    }
    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double divide(int a, double b) {
        return a / b;
    }
}
