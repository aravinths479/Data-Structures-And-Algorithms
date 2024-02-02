// Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output : 4
// Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

import java.util.HashMap;
import java.util.Map;

class majorityElement {

	public static void find(int arr[])
	{
		int maxCount = 0;
		int index = -1; // sentinels
		for (int i = 0; i <arr.length; i++) {
			int count = 0;
			for (int j = 0; j <arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		if (maxCount >arr.length / 2)  // question constraint
			System.out.println(arr[index]);

		else
			System.out.println("No Majority Element");
	}

	// anothor solution 

	public static int anotherSoloution(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        System.out.println(map);
        int max = Integer.MIN_VALUE;
        int res = 0;
		
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }

	// Driver code
	public static void main(String[] args)
	{

		int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
		anotherSoloution(arr);
	}
}
