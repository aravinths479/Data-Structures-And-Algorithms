package simple_programs;

import java.util.*;

public class primeUpToN {
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        int arr[] = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("---- Output ----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (isPrime(j)) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}
