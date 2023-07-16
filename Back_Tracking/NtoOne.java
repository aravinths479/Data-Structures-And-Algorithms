package Back_Tracking;

public class NtoOne {
    public static void print(int i, int n){
        if(i>n){
            return;
        }
        print(i+1, n);
        System.out.println(i);  // only prints after executing the above function
    }
    public static void main(String args[]){
        int i = 1;
        int n = 10;
        print(i, n);
    }
}
