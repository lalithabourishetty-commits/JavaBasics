public class SquarePattern {
    public static void main(String args[]) {
       // squarePattern(3);
       // crossPattern(5);
       //hallowSquare(5);
       //hallowIncreasingTriangle(5);
        hallowDecreasingTriangle(5);
    }

    private static void hallowDecreasingTriangle(int number) {
        for (int row =number-1; row >=0; row--) {
            for (int colmn = 0; colmn <=row; colmn++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void hallowIncreasingTriangle(int n) {
        for (int row = 0; row < n; row++) {
            for (int colmn = 0; colmn <=row; colmn++) {
                if(colmn==0||row==n-1||row==colmn)
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
                if ((row == colmn) || (row + colmn == n-1))
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
                if ((row == 0) || (row == n-1) ||(colmn == 0)||(colmn == n-1))
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
