package com.oneoonenet;

/**
 * Print Pascal's Triangle in Java
 */
class GFG {

    /**
     * Driver code
     * @param args = Program arguments
     */
    public static void main(String[] args) {
        int n = 8;
        printPascal(n);
    }

    /**
     * Pascal function
     * @param n = the height of Pascal's triangle
     */
    public static void printPascal(int n) {

        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                // for left spacing
                System.out.print("+");
            }

            // used to represent c(line, i)
            int c = 1;
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(c + "_");
                c = c * (line - i) / i;
            }
            System.out.println();
        }
    }
}
