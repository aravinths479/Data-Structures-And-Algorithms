// 5
//     *
//    *  *
//   *  *  *
//  *  *  *  *
// *  *  *  *  *

package patterns;
import java.util.*;
public class star_triangle_pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc = 0;
        for(int i=1;i<=n;i++){
            spc = n-i;
            for(int j=0;j<spc;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
