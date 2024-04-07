// The HCF or GCD of two or more numbers is the largest positive integer that divides all of the given numbers 
// without leaving a remainder.

// For example, let's take two numbers: 48 and 18.

// The factors of 48 are: 1, 2, 3, 4, 6, 8, 12, 16, 24, 48.
// The factors of 18 are: 1, 2, 3, 6, 9, 18.

// The common factors of 48 and 18 are: 1, 2, 3, 6.
// Among these common factors, the largest one is 6. Therefore, the HCF or GCD of 48 and 18 is 6.

package simple_programs;
import java.util.*;
public class hcf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int hcf = 1;
        if(n1<n2){
            for(int i=1;i<= n1;i++){
                if(n1%i==0 && n2%i ==0){
                    hcf = i;
                }
            }
        System.out.println("HCF : "+hcf);
        }
        else{
            for(int i=1;i<= n2;i++){
            if(n1%i==0 && n2%i ==0){
                hcf = i;
            }
        }
        System.out.println("HCF : "+hcf);
        }
        
    }
}
