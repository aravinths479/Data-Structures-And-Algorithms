// 2. Inverted Right Triangle:
//    Input: 5
//    Output:
//    ```
//    *****
//    ****
//    ***
//    **
//    *
//    ```

package patterns.patternsPart2;

public class invertedRightTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
