// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.


// Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.


// Example 2:

// Input: ratings = [1,2,2]
// Output: 4
// Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
// The third child gets 1 candy because it satisfies the above two conditions.


// Example 3:

// Input: ratings = [12,4,3,11,34,34,1,67]
// Output: 16




import java.util.Arrays;


public class candy {
    public static int candy(int[] ratings) {
        int leftToRight[] = new int[ratings.length];
        int rightToLeft[] = new int[ratings.length];

        Arrays.fill(leftToRight,1);
        Arrays.fill(rightToLeft,1);

        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                leftToRight[i] = leftToRight[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rightToLeft[i] = rightToLeft[i+1]+1;
            }
        }
        int total = 0;
        for(int i=0;i<ratings.length;i++){
            total += Math.max(leftToRight[i],rightToLeft[i]);
        }
        System.out.println(Arrays.toString(leftToRight));
        System.out.println(Arrays.toString(rightToLeft));
        return total;

    }

    public static void main(String[] args) {
        int ratings[] = {12,4,3,11,34,34,1,67};
        System.out.println("Answer : "+ candy(ratings));
    }
    
}