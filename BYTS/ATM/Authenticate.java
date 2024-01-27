import java.util.ArrayList;
import java.util.Scanner;

public class Authenticate extends opreation {

    public static void createAccount(Scanner sc, ArrayList<BankAccount> accounts) {
        System.out.print("\nEnter your Username : ");
        String userName = sc.next();
        System.out.print("\nEnter your PIN : ");
        int pin = sc.nextInt();
        System.out.print("\nEnter Initial deposit : ");
        int deposit = sc.nextInt();

        for (BankAccount account : accounts) {
            if (account != null && account.getUsername().equals(userName)) {
                System.out.print("\nUsername already exists. Please choose a different username.");
                System.out.println();
                return;
            }
        }

        accounts.add(new BankAccount(userName, pin, deposit));
        System.out.print("\nAccount created successfully.");
        System.out.println();
    }

    public static void login(Scanner sc, ArrayList<BankAccount> accounts) {
        System.out.print("\nEnter your Username : ");
        String userName = sc.next();
        System.out.print("\nEnter pin : ");
        int pin = sc.nextInt();

        BankAccount account = findAccount(accounts, userName, pin);

        if (account != null) {
            System.out.print("\nLogin successful.");
            System.out.println();
            performOperations(sc, account);
        } else {
            System.out.print("\n Incorrect  username or password.");
            System.out.println();
        }
    }

    private static BankAccount findAccount(ArrayList<BankAccount> accounts, String userName, int pin) {
        for (BankAccount account : accounts) {
            if (account != null && account.getUsername().equals(userName)) {

                if (account != null && account.getPin() == pin) {
                    return account;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}
