import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------- Welcome to the Burger Shop --------------");
        System.out.println("1) Order Burger of the day");
        System.out.println("2) Order your own burger");
        System.out.println("3) Exit");
        while(true){
            System.out.print(">> ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    burgerOfTheDay burgerOfTheDay = new burgerOfTheDay();
                    burgerOfTheDay.run();
                    break;
                }
                case 2:{
                    CusBurger bug = new CusBurger();
                    bug.run();
                    break;
                }
                case 3:{
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                }
                default : {
                    break;
                }
            }

        }
    }
}
