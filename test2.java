import java.util.Arrays;
import java.util.Stack;

class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
                System.out.println("postive ast : " + stack);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // Destroy the asteroid moving to the right
                    System.out.println("While loop : " + stack);
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // No collision or surviving asteroid moving to the left
                    System.out.println("negative peek and ast peek : " + stack);
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids annihilate each other
                    System.out.println("annihilate each other : " + stack);
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, 8, -6, 3, -10 };
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
}
