// input : 5
// output :   
//         1
//         1 2
//         1 2 3
//         1 2 3 4
//         1 2 3 4 5

// https://www.programiz.com/c-programming/examples/pyramid-pattern

package patterns;
import java.util.*;
public class leftSidePyramidNumbers {
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
   }
}
