package evening_class;

import java.util.Scanner;

public class primeUpToN {
    public static boolean isprime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int arr[] = new int[testcase];

        for (int i = 0; i < testcase; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= arr[i]; j++) {
                if (isprime(j)) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
