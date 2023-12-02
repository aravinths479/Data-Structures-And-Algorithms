/* 
 
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, 
a double period '..' refers to the directory up a level, 
and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. 
For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.


Example 1:

Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

 */

package Stack;

import java.util.*;

/**
 * simplifyPath
 */
public class simplifyPath {

        // Function to simplify the given Unix-style file path
        public static String simplifyPath(String path) {
            // Create a stack to store components of the simplified path
            Stack<String> st = new Stack<>();
            
            // Split the input path using "/"
            String components[] = path.split("/");
    
            // Process each component
            for(String i : components) {
                // If the component is "..", pop from the stack to move up one level
                if(i.equals("..")) {
                    if(!st.empty()) {
                        st.pop();
                    }
                }
                // If the component is not empty and not ".", push it onto the stack
                else if(!i.isEmpty() && !i.equals(".")) {
                    st.push(i);
                }
            }
    
            // Build the simplified path from the stack
            String res = "";
            for(String str : st) {
                res += "/" + str;
            }
    
            // If the stack is empty, return "/"
            return res.length() == 0 ? "/" : res;
        }
    
        // Main function for testing
        public static void main(String[] args) {
    
            // Example usage
            String path1 = "/home/";
            String path2 = "/../";
            String path3 = "/home//foo/";
            String path4 = "/a/./b/../../c/";
    
            System.out.println(simplifyPath(path1));  // Output: "/home"
            System.out.println(simplifyPath(path2));  // Output: "/"
            System.out.println(simplifyPath(path3));  // Output: "/home/foo"
            System.out.println(simplifyPath(path4));  // Output: "/c"
        }
    
}
