// You're tasked with creating a Java program to simulate an ATM machine. 
// The ATM has denominations: 1000, 500, 100, 50, and 10. Users input a withdrawal amount; 
// the program checks if the ATM has enough money. 
// If yes, it calculates the needed denominations, updates balances, and displays dispensed denominations. 
// Finally, it shows the new ATM balance. Handle insufficient funds gracefully, providing clear user messages.
// Your program should use variables, loops, and conditionals to achieve this simulation. 
// Note: ATM balances and denominations are predefined, not real-time.

import java.lang.reflect.Array;
import java.util.*;

public class atmDenominations {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[]  arr = {1000,500,100,50,10};
        int[] bal =  {10,30,50,70,100};

        System.out.print("Enter amount to withdraw : ");

        int amount = sc.nextInt();
        int totalMoney = 0;
        for(int i=0;i<arr.length;i++){
            totalMoney = totalMoney + (arr[i]*bal[i]);
        }

        System.out.println(totalMoney);

        if(totalMoney>=amount){
            for(int i=0;i<arr.length;i++){
            int denomination = amount/arr[i];
            if(denomination>bal[i]){
                continue;
            }
            System.out.println(arr[i]+" = "+denomination);
            amount = amount%arr[i];
            bal[i] = bal[i] - denomination;
            }

            System.out.println("ATM denminations count remaining ");
            int i=0;
            while(i<=arr.length-1){
                System.out.println(arr[i] + " = "+bal[i]);
                i++;
            }
        }
        else{
            System.out.println("Not enough denominations in ATM right now");
        }
        
    }
}
