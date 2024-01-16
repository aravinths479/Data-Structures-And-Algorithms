import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2Leetcode {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        
        if(rowIndex==0){
            return firstRow;
        }
        
        res.add(firstRow);

        for(int i=1;i<rowIndex+1;i++){

            List<Integer> prevRow = res.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);
            for(int j=1;j<i;j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currentRow.add(1);
            res.add(currentRow);
        }

        return res.get(rowIndex);
    }
    public static void main(String[] args) {
        int numRows = 3;
        List<Integer> result = getRow(numRows);

        System.out.println(result);
    }
}
