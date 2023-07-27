// Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
// Output: 3
// Explanation: Minimum distance between the words “the” and “fox” is 3

// Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
// Output: 2
// Explanation: Minimum distance between the words “geeks” and “practice” is 2


import java.util.*;
public class find_the_minimum_distance_between_the_given_two_words{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        int min_distance = str.length;
        String word1 = sc.next();
        String word2 = sc.next();
        int index1 = -1;
        int index2 = -1;
        // int min_dis = Integer.MAX_VALUE;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(word1)){
                index1 = i; 
            }
            if(str[i].equals(word2)){
                index2 = i; 
            }

            if(index1 != -1  &&  index2 !=-1){
                int current_distance = Math.abs(index1 - index2);
                if(current_distance<min_distance){
                    min_distance = current_distance;
                }
            }
            // or
            // if(index1!=-1 && index2!=-1){

            //     min_dis = Math.min(min_dis,Math.abs(index1-index2));
            // }

        }
        System.out.println(min_distance);

    }

}
