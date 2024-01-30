// Input: n = 3
// Output: [[1,2,3],[8,9,4],[7,6,5]]




// note rowLower and rowUpper mistakenly written in wrong format
// also rowLower and rowUpper mistakenly written in wrong format 
// check spiral_matrix another program







public class spiral_matrix_1 {
    public static void spiral(int n){
        int rowUpper = 0;
        int rowLower = n - 1;
        int colUpper = 0;
        int colLower = n - 1;
        int count = 1;
        int mat[][] = new int[n][n];

        while(rowUpper <= rowLower || colUpper <= colLower){
            
            for(int i=colUpper;i<=colLower;i++){
                mat[rowUpper][i] = count;
                count = count+1;
                
            }
            rowUpper = rowUpper + 1;

            for(int i=rowUpper;i<=rowLower;i++){
                mat[i][colLower] = count;
                count++;
                
            }
            colLower = colLower - 1;

            // breaking condition when it no longer should run this loop
            if (rowLower < rowUpper || colLower < colUpper) {
                break;
            }

            for(int i=colLower;i>=colUpper;i--){
                mat[rowLower][i] = count;
                count++;
                
            }
            rowLower = rowLower  - 1;

            for(int i=rowLower;i>=rowUpper;i--){
                mat[i][colUpper] = count;
                count++;

            }
            colUpper = colUpper +1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 3;
        spiral(n);
    }
}
