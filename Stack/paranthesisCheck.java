// input : ({[]})
// output : true


package Stack;
import java.util.*;

public class paranthesisCheck {
    public static boolean check(String str){

        if(str.length()==0){
            return true;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(' ){
                st.push(str.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                char last_ele = st.pop();
                if(last_ele == '(' && str.charAt(i) == ')' ){
                    continue;
                }
                else if(last_ele == '[' && str.charAt(i) == ']' ){
                    continue;
                }
                else if(last_ele == '{' && str.charAt(i) == '}' ){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));
    }
}

// push(element):     Adds an element to the top of the stack.
// pop():             Removes and returns the element at the top of the stack.
// peek():            Returns the element at the top of the stack without removing it.
// empty():           Checks if the stack is empty and returns a boolean value.
// search(element):   Returns the 1-based position of the element from the top of the stack. If the element is not found, it returns -1.
