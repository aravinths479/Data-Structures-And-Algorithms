// Example 1:

// Input: salary = [4000,3000,1000,2000]
// Output: 2500.00000
// Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
// Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

// Example 2:

// Input: salary = [1000,2000,3000]
// Output: 2000.00000
// Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
// Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


import java.util.*;

public class averageSalaryExcludeMaxMin {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        int count = 0;
        for(int i=1;i<salary.length-1;i++){
            total = total + salary[i];
            count++;
        }
        return total/count;
    }
    public static void main(String args[]){
        int salary[] = {4000,3000,1000,2000}; 
        double res = average(salary);
        System.out.println(res);
    }
}


