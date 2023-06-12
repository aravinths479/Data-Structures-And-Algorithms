// Input: 123456
// Output: 654321

package simple_programs;
import java.util.*;
public class reverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        while(n>0){
            int rem = n%10;
            str = str + rem;
            n = n/10;
        }
        System.out.println(str);
        
    }
}
