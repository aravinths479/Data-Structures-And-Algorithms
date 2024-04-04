package JavaConcepts;


// Definition of a BankAccount class with encapsulation
// Definition of a BankAccount class with encapsulation
class BankAccount {
    private double balance; // private access modifier for encapsulation

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }


    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("withdraw sucessful, currrent balance : "+balance);
        } else {
            System.out.println("Insufficient balance,currrent balance : "+balance);
        }
    }


    // Method to check the balance
    public double getBalance() {
        return balance;
    }
}

// Main class demonstrating the usage of the BankAccount class
public class encapsulation {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount(1000);

        // Depositing and withdrawing money (accessing methods)
        account.deposit(500);
        account.withdraw(500);
        

        // Retrieving and displaying the balance (accessing data)
        System.out.println("Current balance: $" + account.getBalance()); // Output: Current balance: $1300.0
    }
}
