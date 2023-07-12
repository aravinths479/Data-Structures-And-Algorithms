// Input: matrix = [[1,2,3],
//                  [4,5,6],
//                  [7,8,9]]

//     Output:    [[7,4,1],
//                 [8,5,2],
//                 [9,6,3]]


public class rotateImage {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j>i){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];    // transpose first
                    matrix[j][i] = temp;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            int left = 0;
            int right = matrix[0].length -1;
            while(left<=right){
                int temp = matrix[i][left];             // then reverse the elements in each rows
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                
                left++;
                right--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] matrix = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
        rotate(matrix);                
    }
}
