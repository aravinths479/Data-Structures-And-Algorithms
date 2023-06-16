// 6
//      1 
//     1 2 
//    1 2 3 
//   1 2 3 4 
//  1 2 3 4 5
// 1 2 3 4 5 6
//  1 2 3 4 5
//   1 2 3 4
//    1 2 3
//     1 2
//      1

package patterns;
import java.util.*;
public class diamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }    
}
