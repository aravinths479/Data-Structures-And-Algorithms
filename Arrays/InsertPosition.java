import java.lang.reflect.Array;
import java.util.*;

public class InsertPosition {

    public static void array() {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[15];
        int n = 10;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Insert position : ");
        int position = sc.nextInt();
        for (int i = n; i >= position; i--) {
            arr[i + 1] = arr[i];
        }

        System.out.println("Enter the element want to add : ");
        int element = sc.nextInt();
        arr[position] = element;
        System.out.println(Arrays.toString(arr));

        System.out.println("Element to be deleted (position) : ");
        int deletedPos = sc.nextInt();

        for (int i = deletedPos; i < 11; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));
        

        System.out.println("Delete element by value : ");
        int delval = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == delval) {

                for (int j = deletedPos; j < 11; j++) {
                    arr[j] = arr[j + 1];
                }

                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void arrayList() {
        int arr[] = new int[15];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter values : ");
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(sc.nextInt());
        }
        System.out.println("Enter Insert position : ");
        int pos = sc.nextInt();
        System.out.println("Enter the element want to add : ");
        int element = sc.nextInt();
        lst.add(pos, element);
        System.out.println(lst);
        System.out.println("Enter the element to be removed(index) : ");
        int deleted = sc.nextInt();
        lst.remove(deleted);
        System.out.println(lst);
        System.out.println("Enter the element to be removed(value) : ");
        int index = sc.nextInt();
        lst.remove(Integer.valueOf(index));
        System.out.println(lst);
    }

    public static void main(String[] args) {

        array();
        // arrayList();

    }
}
