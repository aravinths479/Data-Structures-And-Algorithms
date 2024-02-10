/*

convert to Indian number system to International system .

Input : "123,456,789"
Output : "123,456,789"

 */

package simple_programs;

public class IndianNumberConverter {

    public static String convert(String str) {

        if(str.length() ==3){
            return str;
        }

        StringBuilder res2 = new StringBuilder();

        // Step 1: Remove commas and reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ',') {
                res2.append(str.charAt(i));
            }
        }
        res2.insert(3, ',');
        int count = 0;
        for (int i = 4; i < res2.length(); i++) {
            if (count == 2) {
                res2.insert(i, ',');
                i++;
                count = 0;
            }
            count++;
        }

        return res2.reverse().toString();
    }

    public static void main(String[] args) {

        String str = "123,456,789";
        System.out.println(convert(str));
    }
}
