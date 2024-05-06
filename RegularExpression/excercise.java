/*

1. **Check String for Certain Characters:**
   - `[a-zA-Z0-9]+`

2. **Match 'a' followed by zero or more 'b's:**
   - `ab*`

3. **Match 'a' followed by one or more 'b's:**
   - `ab+`

4. **Match 'a' followed by zero or one 'b':**
   - `ab?`

5. **Match 'a' followed by three 'b's:**
   - `ab{3}`

6. **Match 'a' followed by two to three 'b's:**
   - `ab{2,3}`

7. **Find Sequences of Lowercase Letters Joined by Underscore:**
   - `[a-z]+_[a-z]+`

8. **Find Sequences of One Uppercase Letter Followed by Lowercase Letters:**
   - `[A-Z][a-z]+`

9. **Match 'a' Followed by Anything Ending in 'b':**
   - `a.*b$`

10. **Match Word at the Beginning of a String:**
    - `^\w+`

11. **Match Word at the End of a String with Optional Punctuation:**
    - `\b\w+\W*$`

12. **Match Word Containing 'z':**
    - `\b\w*z\w*\b`

13. **Match Word Containing 'z', Not Start or End of Word:**
    - `\b\w*z\w*\b`

14. **Match String Containing Only Upper and Lowercase Letters, Numbers, and Underscores:**
    - `^[a-zA-Z0-9_]+$`

15. **Start Each String with a Specific Number:**
    - `^123`

16. **Remove Leading Zeros from an IP Address:**
    - `\b0+(\d+)`

17. **Check for a Number at the End of a String:**
    - `\d+$`

18. **Search for Numbers (0-9) of Length Between 1 and 3:**
    - `\b\d{1,3}\b`

19. **Search for Literal Strings Within a String:**
    - `fox|dog|horse`

20. **Search for Literal String in a String and Find Location:**
    - `fox`

21. **Find Substrings Within a String:**
    - `exercises`

22. **Find Occurrence and Position of Substrings Within a String:**
    - `(exercises)`

23. **Replace Whitespaces with Underscore and Vice Versa:**
    - `[ _]`

24. **Extract Year, Month, and Date from an URL:**
    - `/(\d{4})/(\d{2})/(\d{2})/`

25. **Convert yyyy-mm-dd to dd-mm-yyyy:**
    - `(\d{4})-(\d{2})-(\d{2})`

26. **Match if Two Words Start with the Letter 'P':**
    - `^(P\w+)\s+(P\w+)`

27. **Separate and Print Numbers in a String:**
    - `\d+`

28. **Find Words Starting with 'a' or 'e' in a String:**
    - `\b[a|e]\w*\b`

29. **Separate and Print Numbers and Their Position:**
    - `\b\d+\b`

30. **Abbreviate 'Road' as 'Rd.' in a String:**
    - `Road`

31. **Replace All Occurrences of Space, Comma, or Dot with a Colon:**
    - `[ ,.]`

32. **Replace Maximum 2 Occurrences of Space, Comma, or Dot with a Colon:**
    - `[ ,.](?=[^ ,.]*[ ,.][^ ,.]*[ ,.])`

33. **Find All Five-Character Words in a String:**
    - `\b\w{5}\b`

34. **Find All Three, Four, and Five Character Words in a String:**
    - `\b\w{3,5}\b`

35. **Find All Words at Least 4 Characters Long in a String:**
    - `\b\w{4,}\b`

36. **Convert Camel-Case to Snake-Case:**
    - `([a-z])([A-Z])` replacing with `$1_$2` and then converting the result to lowercase


37. **Convert Snake-Case to Camel-Case:**
    - `_(\w)` replacing with `\U$1` and then converting the result to title case

38. **Extract Values Between Quotation Marks:**
    - `\"(.*?)\"`

39. **Remove Multiple Spaces from a String:**
    - `\s+` replacing with a single space

40. **Remove All Whitespaces from a String:**
    - `\s+` replacing with an empty string

 */

package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class excercise {
    public static void main(String[] args) {
        String text = "Hello, world! This is a sample text.";
        String patternString = "[a-zA-Z0-9]";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);
        

        if (matcher.find()) {
            System.out.println("Pattern found at index " + matcher.start());
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
