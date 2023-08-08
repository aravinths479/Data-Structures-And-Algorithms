// 13. Hollow Rhombus:
//     Input: 4
//     Output:
//     ```
//        *****
//       *   *
//      *   *
//     *   *
//      *   *
//       *   *
//        *****
//     ```

package patterns.patternsPart2;

public class hollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            for(int spc = 0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int spc=0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
