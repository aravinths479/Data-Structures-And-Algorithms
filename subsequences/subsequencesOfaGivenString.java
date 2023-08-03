

public class subsequencesOfaGivenString {
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        print(str.substring(1),ans+str.charAt(0));
        print(str.substring(1),ans);

    }
    public static void main(String args[]){
        String str ="abc";
        String ans ="";
        print(str,ans);
    }
}
