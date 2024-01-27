import java.util.Scanner;


class opreation {

    public static void balance(Scanner sc, BankAccount bankAccount) {
        System.out.print("\n Your Available Balance : " + bankAccount.getBalance());
    }

    public static void withdraw(Scanner sc, BankAccount bankAccount) {
        System.out.print("\nEnter the amount to withdraw : ");
        int amount = sc.nextInt();
        bankAccount.withdraw(amount);
    }

    public static void setNewPin(Scanner sc, BankAccount bankAccount) {
        System.out.print("\nEnter new PIN : ");
        int newPin = sc.nextInt();
        bankAccount.setPin(newPin);
        System.out.print("\nNew PIN set successfully");
        System.out.println();
    }

    public static void depositAmount(Scanner sc, BankAccount bankAccount) {
        System.out.print("\nEnter The Deposit Amount : ");
        int depositAmount = sc.nextInt();
        bankAccount.deposit(depositAmount);
        System.out.print("\nMoney deposited into bank");
        System.out.println();
    }

    public static void performOperations(Scanner sc, BankAccount account) {
        int choice;
        do {
            System.out.println();
            System.out.print("\n1. Withdraw");
            System.out.print("\n2. Set New PIN");
            System.out.print("\n3. Deposit Amount");
            System.out.print("\n4. Get Balance");
            System.out.print("\n5. Go Back ( Logout )");
            System.out.print("\n6. Exit");
            System.out.println();
            System.out.print("\nEnter your choice : ");
            System.out.println();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    withdraw(sc, account);
                    break;
                case 2:
                    setNewPin(sc, account);
                    break;
                case 3:
                    depositAmount(sc, account);
                    break;
                case 4:
                    balance(sc, account);
                    break;    
                case 5:
                    break;    
                case 6:
                    System.out.print("\nThank you for using our service");
                    System.exit(0);
                default:
                    System.out.print("\nInvalid Operation");
                    break;
            }
        } while (choice != 5);
    }
}