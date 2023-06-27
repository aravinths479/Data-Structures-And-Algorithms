// Input: base = 2, exponent = 3
// Output: 8

package recursion;
import java.util.*;
public class power {
    public static int calc(int base, int exponent){
        int res = base;
        if(exponent == 1){
            return res;
        }   
        return res * calc( base , exponent -1 ); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int res = calc(base,exponent);
        System.out.println(res);
    }
}
