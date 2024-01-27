package BYTS.inner_class;

/*
 
In this example, the Account class is an inner class of the Bank class.
It encapsulates the details of the bank account and has access to the private members of the outer class.
The Bank class demonstrates how to create a bank, perform transactions, 
    and display the account information using the inner class.

*/


public class Bank {
    
    private String name;
    private Account account;

    public Bank(String name) {
        this.name = name;
        this.account = new Account();
    }

    public void displayAccountInfo() {
        System.out.println("Bank: " + name);
        account.showBalance();
    }

    // Member Inner Class
    private class Account {
        private double balance;

        public Account() {
            this.balance = 0.0;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        public void showBalance() {
            System.out.println("Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Bank myBank = new Bank("MyBank");
        myBank.account.deposit(1000.0);
        myBank.account.withdraw(500.0);
        myBank.displayAccountInfo();
    }
}


