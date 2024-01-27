// Input: s = "III"
// Output: 3
// Explanation: III = 3.



// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

package Strings;
import java.util.HashMap;
import java.util.Map;

public class romanToInteger{
    public static int romanToInt(String s) {
        Map<Character,Integer> set = new HashMap<Character,Integer>();
        set.put('I',1);
        set.put('V',5);
        set.put('X',10);
        set.put('L',50);
        set.put('C',100);
        set.put('D',500);
        set.put('M',1000);
        int previousValue = set.get(s.charAt(0));
        int res = 0;
        for(int i=1;i<s.length();i++){
            int currentValue = set.get(s.charAt(i));
            if(previousValue < currentValue){
                res = res - previousValue;
            }
            else{
                res = res + previousValue;
            }
            previousValue = currentValue;
        }
        return res+previousValue;
        
    }
    public static void main(String args[]){
        int res = romanToInt("III");
        System.out.println(res);
    }
}
