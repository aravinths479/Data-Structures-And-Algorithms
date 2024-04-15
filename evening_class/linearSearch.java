package evening_class;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int tar = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean res = false;
        for (int i = 0; i < n; i++) {
            if (tar == arr[i]) {
                res = true;
            }
        }
        if (res) {
            System.out.println(res);
        }
        else{
            System.out.println(res);
        }
    }
}