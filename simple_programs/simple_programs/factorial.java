package simple_programs;

import java.util.Scanner;

public class factorial {
    public static int calc_factorial(int n){
        if(n==0){
            return 1;
        }
        return n * calc_factorial(n-1);
    }

    public static int calc_factorial2(int n){
        if(n==1 || n==0){
            return 1;
        }

        int res = 1;
        for(int i=1;i<=n;i++){
            res = res* i;
        }
        
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = calc_factorial2(n);

        System.out.println(fact);
    }
}
