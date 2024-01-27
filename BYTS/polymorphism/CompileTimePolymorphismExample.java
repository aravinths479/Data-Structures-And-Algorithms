package BYTS.polymorphism;


class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 10);
        double result2 = calculator.add(3.5, 2.5);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
    
