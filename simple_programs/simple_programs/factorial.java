package simple_programs;

import java.util.Scanner;

public class factorial {
    public static int calc_factorial(int n){
        if(n==0){
            return 1;
        }
        return n * calc_factorial(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = calc_factorial(n);
        System.out.println(fact);
    }
}
