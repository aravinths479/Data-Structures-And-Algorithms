// Input: 12345
// Output: 15

package recursion;
import java.util.*;
public class sumOfDigits {

    public static int sum(int n) {
        
        if(n == 0){
            return n;
        }
        return n%10 + sum(n/10);  
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println(res);
    }
}
