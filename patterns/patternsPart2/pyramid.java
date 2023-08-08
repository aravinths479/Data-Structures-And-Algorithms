// 3. Pyramid:
//    Input: 5
//    Output:
//    ```
//        *
//       ***
//      *****
//     *******
//    *********
//    ```

package patterns.patternsPart2;

public class pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int spc=0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
