//           1
//         2 3 2
//       3 4 5 4 3
//     4 5 6 7 6 5 4
//   5 6 7 8 9 8 7 6 5



package patterns;
import java.util.*;
public class fullPyramidNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("  ");  // to be aligned perfectely center yse two spaces
            }
            for(int j=i;j<=(i*2)-1;j++){
                System.out.print(j+" ");    // prints in increasing order
            }
            for(int j=(i*2)-2;j>=i;j--){    // prints in decreasing order
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
   