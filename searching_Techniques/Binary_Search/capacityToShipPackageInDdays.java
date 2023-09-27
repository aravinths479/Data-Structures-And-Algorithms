// https://www.youtube.com/watch?v=MG-Ac4TAvTY&list=PLgUwDviBIf0pMFMWuuvDNMAkoQFi-h0ZF&index=16

// A conveyor belt has packages that must be shipped from one port to another within days days.

// The ith package on the conveyor belt has a weight of weights[i].
//  Each day, we load the ship with packages on the conveyor belt (in the order given by weights). 
//  We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on 
// the conveyor belt being shipped within days days.

 

// Example 1:

// Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
// Output: 15
// Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
// 1st day: 1, 2, 3, 4, 5
// 2nd day: 6, 7
// 3rd day: 8
// 4th day: 9
// 5th day: 10

// Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and 
// splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.


// Example 2:

// Input: weights = [3,2,2,4,1,4], days = 3
// Output: 6
// Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
// 1st day: 3, 2
// 2nd day: 2, 4
// 3rd day: 1, 4


// Example 3:

// Input: weights = [1,2,3,1,1], days = 4
// Output: 3
// Explanation:
// 1st day: 1
// 2nd day: 2
// 3rd day: 3
// 4th day: 1, 1



// solution


// read - you will understand



// Determine the Initial Search Range:

// The minimum capacity of the ship (left) cannot be less than the maximum weight of any single package 
// because you can't split packages. To find this, you use the max utility function.

// The maximum capacity of the ship (right) cannot be greater than the sum of all package 
// weights because you could ship all the packages in a single day if you had the capacity to carry all of them. 
// To find this, you use the sum utility function.

// Binary Search:

// The code enters a while loop, which will perform binary search to find the minimum capacity required to
//  ship all packages within D days.

// while (left <= right) {

// Mid-Point Calculation:

// In each iteration, calculate the mid-point between left and right. This mid-point represents a potential ship capacity.

// int mid = left + (right - left) / 2;

// Simulate Shipping:

// Simulate the shipping process with the mid-point capacity to see if it's possible to ship all packages within D days.

// Initialize days_needed to 1 (assuming the first day).

// Initialize capacity to 0 (current weight on the ship).


// int days_needed = 1;
// int capacity = 0;

// Iterate through the list of package weights and add each weight to the capacity. 
// If at any point the capacity exceeds the mid-point capacity, it means you need another day, 
// so increment days_needed and reset capacity.


// for (int i = 0; i < weights.length; i++) {
//     if (weights[i] + capacity > mid) {
//         days_needed = days_needed + 1;
//         capacity = 0;
//     }
//     capacity = capacity + weights[i];
// }


// Adjust Search Range:

// If the days_needed is greater than D, it means the capacity is too small. 
// In this case, set left to mid + 1 to search in the right half of the range.

// Otherwise, if the days_needed is less than or equal to D, the capacity might be sufficient or even more than required. 
// In this case, set right to mid to search in the left half of the range.


// if (days_needed > days) {
//     left = mid + 1;
// } else {
//     right = mid - 1;
// }

// Result:

// After the binary search loop, left will contain the minimum capacity required to ship all packages within D days.


// Return left as the minimum capacity.



package searching_Techniques.Binary_Search;

public class capacityToShipPackageInDdays {
    public static int max(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int left = max(weights);
        int right = sum(weights);
        // or this -->  int right = Arrays.stream(weights).sum();

        while(left<=right){
            int mid = left + (right-left) /2;
            int days_needed = 1;
            int capacity = 0;

            for(int i=0;i<weights.length;i++){
                if(weights[i]+capacity > mid ){
                    days_needed = days_needed +1;
                    capacity = 0;
                }
                capacity = capacity + weights[i];
            }

            if(days_needed > days){
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
}
