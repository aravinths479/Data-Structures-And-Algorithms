
/**

Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, 
"IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.

A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. 
For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00", and "192.168@1.1" are invalid IPv4 addresses.

A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:
1 <= xi.length <= 4
xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
Leading zeros are allowed in xi.
For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.


Example 1:

Input: queryIP = "172.16.254.1"
Output: "IPv4"
Explanation: This is a valid IPv4 address, return "IPv4".


Example 2:

Input: queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
Output: "IPv6"
Explanation: This is a valid IPv6 address, return "IPv6".


Example 3:

Input: queryIP = "256.256.256.256"
Output: "Neither"
Explanation: This is neither a IPv4 address nor a IPv6 address.

**/

package Strings;
public class ipAddressValidation {
    public static boolean ipv4(String digit) {
        if (digit.length() < 1 || digit.length() > 3) {
            return false;
        }

        if (digit.length() > 1 && digit.charAt(0) == '0') {
            return false; // Leading zeros are not allowed
        }

        try {
            int num = Integer.parseInt(digit);
            if (num >= 0 && num <= 255) {
                if (digit.charAt(0) == '0' && digit.length() > 1) {
                    return false; // Leading zeros are not allowed
                }
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return false;
    }

    public static boolean ipv6(String digit) {
        if (digit.length() < 1 || digit.length() > 4) {
            return false;
        }

        // Check if the string consists of valid IPv6 characters (hexadecimal digits and colons)
        for (char c : digit.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || c == ':')) {
                return false;
            }
        }

        return true;
    }

    public static String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            if (queryIP.endsWith(".") || queryIP.startsWith(".")) {
                return "Neither";
            }

            String[] arr = queryIP.split("\\.");
            if (arr.length == 4) {
                for (String ip : arr) {
                    if (!ipv4(ip)) {
                        return "Neither";
                    }
                }
                return "IPv4";
            }
        } else if (queryIP.contains(":")) {
            if (queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == ':') {
                return "Neither";
            }

            String[] arr = queryIP.split(":");
            if (arr.length == 8) {
                for (String str : arr) {
                    if (!ipv6(str)) {
                        return "Neither";
                    }
                }
                return "IPv6";
            }
        }
        return "Neither";
    }

    public static void main(String[] args) {
        String str = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
        System.out.println(validIPAddress(str));
    }
}