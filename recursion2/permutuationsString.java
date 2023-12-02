// tap acadamy - https://www.youtube.com/watch?v=vKQ6oUH02gw 

// input : "abc"
// output : [[a, b, c], [a, c, b], [b, a, c], [b, c, a], [c, b, a], [c, a, b]]

package recursion2;
import java.util.*;
public class permutuationsString {
    public static void permutuate(char[] ch,int fi,List<List<Character>> ans){
        if(fi==ch.length-1){
           // System.out.println(Arrays.toString(ch));
            ans.add(asList(ch));
            return;
        }
        for(int i=fi;i<ch.length;i++){
            swap(ch,fi,i);
            permutuate(ch, fi+1,ans);
            swap(ch,fi,i);
        }
    }
    public static char[] swap(char[] ch,int fi,int i){
        
        char temp = ch[fi];
        ch[fi] = ch[i];
        ch[i] = temp;
        
        return ch;
    }
    public static List<Character> asList(char[] ch){
        List<Character> lst = new ArrayList<>();
        for(char i:ch){
            lst.add(i);
        }
        return lst;
    }
    public static void main(String[] args) {
        String str = "()";
        List<List<Character>> ans = new ArrayList<>();
        int firstIndex = 0;
        permutuate(str.toCharArray(),firstIndex,ans);
        System.out.println(ans);
    }
}
