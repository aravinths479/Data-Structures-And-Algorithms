import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the credit card number: ");
        String creditCardNumber = scanner.nextLine();

        if (isValidCreditCard(creditCardNumber)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is not valid.");
        }
    }

    public static boolean isValidCreditCard(String creditCardNumber) {
        // Check if the number is between 13 to 16 digits
        if (creditCardNumber.length() < 13 || creditCardNumber.length() > 16) {
            return false;
        }

        // Check if the number starts with 4 or 5 or 6
        char firstDigit = creditCardNumber.charAt(0);
        if (firstDigit != '4' && firstDigit != '5' && firstDigit != '6') {
            return false;
        }

        // Double every 2nd digit from right to left using multithreading
        AtomicInteger sum = new AtomicInteger(0);

        Thread evenThread = new Thread(() -> {
            for (int i = creditCardNumber.length() - 2; i >= 0; i -= 2) {
                int digit = Character.getNumericValue(creditCardNumber.charAt(i)) * 2;
                if (digit > 9) {
                    digit = digit % 10 + digit / 10;
                }
                sum.addAndGet(digit);
            }
        });

        Thread oddThread = new Thread(() -> {
            // Add the remaining digits
            for (int i = creditCardNumber.length() - 1; i >= 0; i -= 2) {
                sum.addAndGet(Character.getNumericValue(creditCardNumber.charAt(i)));
            }
        });

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the sum is divisible by 10
        return sum.get() % 10 == 0;
    }
}
