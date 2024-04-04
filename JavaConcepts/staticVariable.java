package JavaConcepts;

// Definition of a BankAccount class
class BankAccount {
    // Static variable to keep track of the total number of accounts
    static int totalAccounts = 0;

    // Constructor to increment the total number of accounts when a new account is created
    BankAccount() {
        totalAccounts++;
    }
    
    // Other class members...
}

// Main class demonstrating the usage of the BankAccount class
public class staticVariable {
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Accessing the static variable using the class name
        System.out.println("Total accounts: " + BankAccount.totalAccounts); // Output: 2
    }
}
