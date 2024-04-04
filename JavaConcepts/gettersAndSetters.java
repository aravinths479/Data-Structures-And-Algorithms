package JavaConcepts;

// Definition of a BankAccount class with encapsulation and getters/setters
class BankAccount {
    private double balance; // private access modifier for encapsulation

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
}

// Main class demonstrating the usage of the BankAccount class with getters/setters
public class gettersAndSetters {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount(1000);

        // Getting the current balance using the getter method
        double currentBalance = account.getBalance();
        System.out.println("Current balance: $" + currentBalance); // Output: Current balance: $1000.0

        // Updating the balance using the setter method
        account.setBalance(1500);

        // Getting the updated balance using the getter method
        currentBalance = account.getBalance();
        System.out.println("Updated balance: $" + currentBalance); // Output: Updated balance: $1500.0
    }
}
