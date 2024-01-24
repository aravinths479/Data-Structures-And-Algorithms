import java.util.*;
public class stringbuffer {
    public static void main(String args[]) {
        stringbuffer sb = new stringbuffer();
        sb.append(" KEC college");
        System.out.println(sb);
        // Covert StringBuffer into String using toString()
        String name = sb.toString();
        System.out.println(name);
        // insert multiple characters
        sb.insert(6, "at");
        System.out.println(sb);
        // delete Multiple Characters
        sb.delete(6, 8);
        System.out.println(sb);
        // delete Specific element
        sb.deleteCharAt(2);
        System.out.println(sb);
        // replace
        sb.replace(2, 5, "@$#");
        System.out.println(sb);
        // reverse
        System.out.println(sb.reverse());
        // charAt()
        System.out.println(sb.charAt(2));
        // similar to replace
        sb.setCharAt(2, '$');
        System.out.println(sb);
        // substring
        System.out.println(sb.substring(2, 6));
    }

    
}
