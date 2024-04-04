// call the method using the call name



package JavaConcepts;

// Definition of a BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Instance method to deposit money into the account
    void deposit(double amount) {
        balance += amount;
    }

    // Instance method to get the balance
    double getBalance() {
        return balance;
    }

    // Static method to calculate interest based on the balance of a BankAccount object
    static double calculateInterest(BankAccount account, double rate) {
        return account.getBalance() * rate / 100.0;
    }
}

// Main class demonstrating the usage of the BankAccount class
public class staticMethod {
    public static void main(String[] args) {
        // Creating a bank account with initial balance
        BankAccount account = new BankAccount(1000); // Corrected constructor invocation

        // Depositing money into the account
        account.deposit(500);

        // Calculating interest using the static method
        double interest = BankAccount.calculateInterest(account, 5.0);

        System.out.println("Interest earned: $" + interest); // Output: Interest earned: $75.0
    }
}
