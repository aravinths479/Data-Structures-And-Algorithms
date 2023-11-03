/* 

Input :

1 2 3 
4 5 6
7 8 9

output : 

1 2 3 
0 5 6 
0 0 9

*/



public class printUpperTriangularMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i>j){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
