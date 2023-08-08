// 12. Character Pattern:
//     Input: 4
//     Output:
//     ```
//     A
//     B B
//     C C C
//     D D D D
//     ```


package patterns.patternsPart2;

public class characterPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                char ch = (char) ('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }   
}
