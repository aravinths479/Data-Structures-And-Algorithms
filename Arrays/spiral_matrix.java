import java.util.*;

public class spiral_matrix {
    public static List<Integer> calc(int arr[][]) {
        List<Integer> lst = new ArrayList<Integer>();

        if (arr.length <= 0) {
            return lst;
        }

        int rowLower = 0;
        int rowUpper = arr.length - 1;
        int colLower = 0;
        int colUpper = arr[0].length - 1; // Use arr[0].length for coloumns

        while (rowLower <= rowUpper && colLower <= colUpper) {

            for (int i = colLower; i <= colUpper; i++) {
                lst.add(arr[rowLower][i]);
            }
            rowLower++;
            for (int i = rowLower; i <= rowUpper; i++) {
                lst.add(arr[i][colUpper]);
            }

            colUpper--;

            // breaking condition when it no longer should run this loop
            if (rowLower > rowUpper || colLower > colUpper) {
                break;
            }
            /*
             * rowLower > rowUpper: If the lower row index has crossed the upper row index,
             *                      there are no more valid rows left to traverse vertically.
             * colLower > colUpper: If the lower column index has crossed the upper column
             *                      index, there are no more valid columns left to traverse horizontally.
             * 
             */

            for (int i = colUpper; i >= colLower; i--) {
                lst.add(arr[rowUpper][i]);
            }
            rowUpper--;

            for (int i = rowUpper; i >= rowLower; i--) {
                lst.add(arr[i][colLower]);
            }
            colLower++;
        }
        return lst;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(calc(arr));
    }
}
