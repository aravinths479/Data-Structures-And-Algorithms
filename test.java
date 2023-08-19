import java.util.*;

public class test {
    public static void print(List<Integer> lst,int index,int[] arr){
        if(index>=arr.length){
            System.out.println(lst);
            return;
        }
        lst.add(arr[index]);
        print(lst,index+1,arr);
        lst.remove(lst.size()-1);
        print(lst,index+1,arr);

    }
    public static void print1(List<Character> lst,int index,char arr1[]){
        if(index>=arr1.length){
            System.out.println(lst);
            return;
        }
        lst.add(arr1[index]);
        print1(lst,index+1,arr1);
        lst.remove(lst.size()-1);
        print1(lst, index+1, arr1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        List<Integer> lst = new ArrayList<>();
        print(lst, 0, arr);
        
        List<Character> lst1 = new ArrayList<>();
        String str = "abc";
        print1(lst1, 0, str.toCharArray());
    }
}
