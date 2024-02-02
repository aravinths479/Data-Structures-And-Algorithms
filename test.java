/**
 * test
 */
public class test {

  public static void main(String[] args) {
    String str = "a1b3c10";
    String num = "";
    char letter = ' ';
    for (char ch : str.toCharArray()) {
      if (!(ch >= '0' && ch <= '9')) {
        if (num != "") {
          for (int i = 0; i < Integer.parseInt(num); i++) {
            System.out.print(letter);
          }
        }
        letter = ch;
        num="";
      } else {
        num += ch;
      }
    }
    for (int i = 0; i < Integer.parseInt(num); i++) {
      System.out.print(letter);
    }
  }
}