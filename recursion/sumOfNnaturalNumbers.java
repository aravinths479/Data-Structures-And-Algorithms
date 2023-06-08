// input : 10
// output : 55

// package recursion;

// import java.util.*;

// public class sumOfNnaturalNumbers {
//     public static int calculate(int num,int sum){
        
//         if(num == 0){
//             return sum;
//         }
//         sum = sum + num;
//         return calculate(num-1,sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int res =  calculate(n,0);
//         System.out.println(res);

//   }
// }


package recursion;

import java.util.*;

public class sumOfNnaturalNumbers {
    public static int calculate(int num){
        
        if(num == 0){
            return num;
        }
        
        return num + calculate(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int res =  calculate(n);
        System.out.println(res);

  }
}

