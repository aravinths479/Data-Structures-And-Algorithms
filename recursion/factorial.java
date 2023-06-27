// Input: 5
// Output: 120

package recursion;
import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);

    }
}
