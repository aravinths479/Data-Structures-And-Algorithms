import java.util.Scanner;
import java.util.ArrayList;

public class Main extends Authenticate{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;
        do {
            System.out.print("\n1. Create Account ");
            System.out.print("\n2. Login  ");
            System.out.print("\n3. Exit  \n");
            System.out.print("\n Enter your choice : ");

            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    createAccount(sc, accounts);
                    break;
                case 2:
                    login(sc, accounts);
                    break;
                case 3:
                    System.out.print("\nThank you for using our service");
                    System.exit(0);
                default:
                    System.out.print("\nInvalid Operation");
            }

        } while (choice != 3);

        sc.close();
    }

}
