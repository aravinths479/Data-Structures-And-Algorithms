import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        System.out.println(sortedList);
        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println(sortedList);
        // This line sorts the sortedList based on the values of the entries in descending order of frequency. Here's how it works:

        // sortedList.sort(...) sorts the list using a custom comparator. 
        // The comparator is defined using a lambda expression (a, b) -> b.getValue() - a.getValue().
        // a and b represent two elements (entries) being compared in the list.
        // a.getValue() and b.getValue() retrieve the values (frequencies) associated with the entries a and b, respectively.
        // b.getValue() - a.getValue() compares the frequencies in reverse order (high to low). 
        // This means it sorts the list in such a way that entries with higher frequencies come first.
        // So, after this sorting, the sortedList will contain the key-value pairs from the original map, 
        // sorted based on their frequencies in descending order. 
        // This is why you will have the most frequent elements first in the sortedList.

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 2, 3, 3, 4, 5, 5, 5};
        int k = 2;
        int res[] = topKFrequent(nums, k);
        System.out.println(Arrays.toString(res));
    }
}
