import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicatesFromArray {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (set.add(num)) {
                result.add(num);
            }
        }

        int[] uniqueArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArr[i] = result.get(i);
        }

        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,8 ,2,8, 4, 4, 5,6, 6};

        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Output: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}

