// 11. Number Pattern:
//     Input: 4
//     Output:
//     ```
//     1
//     2 2
//     3 3 3
//     4 4 4 4
//     ```

package patterns.patternsPart2;

public class numberPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
