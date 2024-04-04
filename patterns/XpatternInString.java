package patterns;

public class XpatternInString {
    public static void main(String[] args) {
        String str = "welcome";
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(i));
            for(int k=0;k<str.length()-(i+i);k++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(str.length()-i-1));
            System.out.println();
        }
        for(int i=0;i<=str.length()/2;i++){
            System.out.print(" ");
        }
        System.out.print(str.charAt(str.length()/2));
        System.out.println();
        
        for(int i=str.length()/2 +1;i<str.length();i++){
            
            for(int j=i;j<str.length()-1;j++){
                System.out.print(" ");
            }
            System.out.print(str.charAt(str.length()-i-1));
            
            System.out.println();
        }

    }
}
