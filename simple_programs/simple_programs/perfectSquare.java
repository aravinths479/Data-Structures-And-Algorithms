// Input: 16
// Output: Perfect square

package simple_programs;
import java.util.*;
public class perfectSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<=n;i++){
            if(i*i == n){
                System.out.println("Perfect Square");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Not a Perfect Square");
        }
    }
}
