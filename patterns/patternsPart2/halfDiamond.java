// 5. Half Diamond:
//    Input: 5
//    Output:
//    ```
//    *
//    **
//    ***
//    ****
//    ****
//    ***
//    **
//    *
//    ```

package patterns.patternsPart2;

public class halfDiamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
