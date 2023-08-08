// 10. Rhombus:
//     Input: 4
//     Output:
//     ```
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *
//     ```


package patterns.patternsPart2;

public class rhombus {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            
            for(int spc = 0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n-1;i>=1;i--){
            for(int spc = 0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
