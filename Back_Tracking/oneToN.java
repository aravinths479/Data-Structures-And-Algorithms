package Back_Tracking;

public class oneToN {
    public static void print(int i){
        if(i==0){
            return;
        }
        print(i-1);
        System.out.println(i);
    }
    public static void main(String args[]){
        int i = 10;
        print(10);
    }
}
