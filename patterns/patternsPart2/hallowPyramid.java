// 4. Hollow Pyramid:
//    Input: 5
//    Output:
//    ```
//        *
//       * *
//      *   *
//     *     *
//    *********
//    ```

package patterns.patternsPart2;

public class hallowPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<n;i++){
            for(int spc = 1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1 || j==(2*i)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<(2*n)-1;i++)
        {
            System.out.print("*");
        }
    }
}
