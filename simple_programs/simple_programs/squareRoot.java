// Input: 16
// Output: 4.0

package simple_programs;
import java.util.*;
public class squareRoot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<n;i++){
            if(i*i <=n){
                ans = i;
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }
}
