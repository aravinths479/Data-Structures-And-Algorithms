package patterns;

public class zigzag {
    public static void main(String[] args) {
        int n = 5;
       
        int value = 0;
        int increment = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                value += increment;
                System.out.print(value + " ");
                increment++;
            }
            System.out.println();
            value = i + 2;
            increment = i + 3;
        }
    }
}
