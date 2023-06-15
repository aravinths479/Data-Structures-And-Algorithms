package patterns;
//  ncr method     -    ncr = n!/((n-r)!*r!)  or ncr = i!/((i-j)!*j!)

import java.util.*;
public class pascal_triangle {
    public static int factorial(int n){
        int res = 1;
        if(n == 0){
            return 1;
        }
        for(int i=1;i<=n;i++){
            res = res*i;
        }
        return res;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int res = factorial(i)/((factorial(i-j))*factorial(j));     // ncr method
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
