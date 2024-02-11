package patterns.patternsPart2;

public class binaryPattern {
    public static String toBinary(int dec){
        
        String str = "";
        while (dec > 0) {
            str = dec % 2 + str;
            dec = dec / 2;
        }
        
        return str;
    }
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            System.out.println(toBinary(i));
        }
    }
}
