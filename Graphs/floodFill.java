/*
 An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. 
You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, 
plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, 
plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. 
Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

 
Example 1:


Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel),
 all pixels connected by a path of the same color as the starting pixel 
 (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.

Example 2:

Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
Output: [[0,0,0],[0,0,0]]
Explanation: The starting pixel is already colored 0, so no changes are made to the image.

 */


package Graphs;

public class floodFill {
    public static void dfs(int[][] image, int sr, int sc, int color, int sourceColor, int i, int j) {
        // Base case: check if the current pixel is out of bounds or has a different
        // color
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != sourceColor) {
            return;
        }

        // Change the color of the current pixel
        image[i][j] = color;

        // Explore neighboring pixels in all directions
        dfs(image, sr, sc, color, sourceColor, i + 1, j);
        dfs(image, sr, sc, color, sourceColor, i, j + 1);
        dfs(image, sr, sc, color, sourceColor, i - 1, j);
        dfs(image, sr, sc, color, sourceColor, i, j - 1);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        // * 1. The condition `image[i][j] != sourceColor` was not sufficient, as it would still
        // * lead to stack overflow when the starting pixel has the same color as the new color.
        // * 2. Modified the condition to `image[i][j] != sourceColor || (i == sr && j== sc)` to handle
        // * the case when the current pixel has the same color as the starting pixel.

        if (image[sr][sc] != color) {
            dfs(image, sr, sc, color, image[sr][sc], sr, sc);
        }
        return image;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }

        };

        int sr = 1; // starting row
        int sc = 1; // starting column
        int newColor = 2; // new color to be filled
        floodFill(image, sr, sc, newColor);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

}
