import java.util.*;
public class new1 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        int n = 5;
        for(int i=0;i<n+1;i++){
            lst.add(new ArrayList<>());
        }

        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);

    }
}