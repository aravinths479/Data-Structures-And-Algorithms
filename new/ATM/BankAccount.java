public class BankAccount {

    private String username;
    private int pin;
    private int balance;

    public BankAccount(String username, int pin, int balance) {
        this.username = username;
        this.pin = pin;
        this.balance = balance;
    }

    public String getUsername() {
        return this.username;
    }
    public int getPin(){
        return this.pin;
    }
    public int getBalance(){
        return this.balance;
    }

    public void setPin(int newPin) {
        this.pin = newPin;
    }


    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Your available balance is :" + this.balance);
    }

    public void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient Balance");
            System.out.println("Your available balance is :" + this.balance);
        } else {
            balance = balance - amount;
            System.out.println("Available balance : " + this.balance);
        }
    }

}
