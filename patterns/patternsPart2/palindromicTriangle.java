// 7. Palindromic Triangle:
//    Input: 4
//    Output:
//    ```
//       1
//      121
//     12321
//    1234321
//    ```

package patterns.patternsPart2;

public class palindromicTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int spc=0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
