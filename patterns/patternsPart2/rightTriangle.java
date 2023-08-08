// 1. Right Triangle:
//    Input: 5
//    Output:
//    ```
//    *
//    **
//    ***
//    ****
//    *****
//    ```

package patterns.patternsPart2;

public class rightTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
