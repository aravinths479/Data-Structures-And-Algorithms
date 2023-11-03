/* 

Input :

1 2 3 
4 5 6
7 8 9

output : 

Left to Right Diagonal Sum : 15
Right to left Diagonal Sum : 15

*/



public class sumOfDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    leftToRightDiagonal += arr[i][j]; 
                }
                if((i+j)==arr.length-1){
                    rightToLeftDiagonal += arr[i][j];
                }
            }
        }
        System.out.println("Left to Right Diagonal Sum : "+leftToRightDiagonal);
        System.out.println("Right to left Diagonal Sum : "+rightToLeftDiagonal);
    }
}
