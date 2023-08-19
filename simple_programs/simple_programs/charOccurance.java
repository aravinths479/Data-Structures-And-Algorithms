// Input: "Hello", 'l'
// Output: 2

package simple_programs;
import java.util.*;
public class charOccurance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = sc.next();
        int count = 0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i) == target.charAt(0)){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
