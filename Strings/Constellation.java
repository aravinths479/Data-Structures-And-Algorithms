package Strings;

public class Constellation {
    // Function to identify the star shape based on the 3x3 block
    public static String find(char[][] arr) {
        if (arr[0][1] == '.' && arr[1][1] == '.') {
            return "U";
        } else if (arr[1][1] == '.') {
            return "O";
        } else if (arr[1][0] == '.' && arr[1][2] == '.') {
            return "I";
        } else if (arr[0][0] == '.' && arr[0][2] == '.' && arr[2][1] == '.') {
            return "A";
        }
        return "E";
    }

    public static void main(String[] args) {
        char[][] mat = {
            {'*', '.', '*', '#', '*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '.', '*', '.'},
            {'*', '.', '*', '#', '*', '.', '*', '#', '.', '*', '.', '#', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '#', '*', '*', '*', '*', '.', '*'}
        };

        StringBuilder res = new StringBuilder();
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[0][j] == '#') {
                res.append('#');
            } else if (j + 2 < mat[0].length && mat[0][j] == '*') {
                char[][] block = {
                    {mat[0][j], mat[0][j + 1], mat[0][j + 2]},
                    {mat[1][j], mat[1][j + 1], mat[1][j + 2]},
                    {mat[2][j], mat[2][j + 1], mat[2][j + 2]}
                };
                res.append(find(block));
                j += 2; 
            }
        }

        System.out.println(res.toString());
    }
}
