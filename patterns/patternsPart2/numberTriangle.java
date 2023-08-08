// 6. Number Triangle:
//    Input: 5
//    Output:
//    ```
//    1
//    12
//    123
//    1234
//    12345
//    ```

package patterns.patternsPart2;

public class numberTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
