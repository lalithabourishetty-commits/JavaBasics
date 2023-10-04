public class SquarePattern {
    public static void main(String[] args) {
        // squarePattern(3);
        // crossPattern(4);
        //hallowSquare(6);
        //hallowIncreasingTriangle(9);
        //hallowDecreasingTriangle(5);
        hillPattern(6);
    }

    private static void hillPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < row; col++) {
                if (row == n - 1 || col == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int col = 1; col < row; col++) {
                if (row == n - 1 || col == row - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void hallowDecreasingTriangle(int number) {
        for (int row = 0; row < number; row++) {
            for (int colmn = 0; colmn < number - row; colmn++) {
                if (row == 0 || colmn == 0 || row + colmn == number - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void hallowIncreasingTriangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int colmn = 0; colmn <= row; colmn++) {
                if (colmn == 0 || row == n - 1 || row == colmn)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void crossPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int colmn = 0; colmn < n; colmn++) {
                if ((row == colmn) || (row + colmn == n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void hallowSquare(int n) {
        for (int row = 0; row < n; row++) {
            for (int colmn = 0; colmn < n; colmn++) {
                if ((row == 0) || (row == n - 1) || (colmn == 0) || (colmn == n - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*
    prints square pattern
        * * *
        * * *
        * * *
    */
    public static void squarePattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int colmn = 0; colmn < n; colmn++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
