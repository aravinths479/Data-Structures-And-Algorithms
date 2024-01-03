package simple_programs;
/**
 * This program determines the color of a square on a chessboard based on its
 * coordinates.
 * The standard chessboard pattern is followed where 'a1' is a black square,
 * 'a2' is a white square, 'b1' is a white square, and so on.
 */
public class determineColorOfAChessboard {

    /**
     * Checks if the square on the chessboard with the given coordinates is black or
     * white.
     *
     * @param coordinates The coordinates of the square in the format "xy" where x
     *                    is a letter (a-h) and y is a digit (1-8).
     * @return true if the square is a black square, false if it's a white square.
     */
    public static boolean check(String coordinates) {
        char ch = coordinates.charAt(0);
        int val = Character.getNumericValue(coordinates.charAt(1));

        // If the sum of the column index and row index is even, it's a black square;
        // otherwise, it's a white square.
        if ((ch - 'a' + val) % 2 == 0) {
            return true; // black square
        } else {
            return false; // white square
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(check("a1")); // Expected: false
        System.out.println(check("h3")); // Expected: true
        System.out.println(check("c7")); // Expected: false
    }
}
