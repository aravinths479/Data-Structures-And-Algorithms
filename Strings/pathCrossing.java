/*

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', 
each representing moving one unit north, south, east, or west, respectively. 
You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, 
if at any time you are on a location you have previously visited. Return false otherwise.

 

Example 1:

Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.


Example 2:

Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.

 */


import java.util.HashSet;

public class pathCrossing {
     public static boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        set.add("0,0");   // don't use "00"  it will create problem when the x or y is greater 9. it will become 2 digit.
        /*
         There's one potential issue with your code. 
         The concatenation of x and y to form the string currentPos 
         might not be sufficient to uniquely represent the position.
         For example, positions (1, 23) and (12, 3) would both be represented as "123" using your approach.
         */
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            String currentPos = ""+ x +","+ y;
            if(set.contains(currentPos)){
                return true;
            }
            set.add(currentPos);
        }

     return false;   
    }
    public static void main(String[] args) {
        String str = "NESWW";
        System.out.println(isPathCrossing(str));
        

    }
}
