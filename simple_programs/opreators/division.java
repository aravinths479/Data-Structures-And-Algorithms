package opreators;

public class division {
    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 4;
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);

    }
}
