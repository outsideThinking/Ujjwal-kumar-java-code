import java.util.Scanner;

public class practice {
    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static void suffixArrayRowWise(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) { // Fix: Start from j=1
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
            }
        }
    }

    static void suffixArrayAfterRowWiseSumColumn(int[][] matrix) {
        suffixArrayRowWise(matrix);
        int r = matrix.length;
        int c = matrix[0].length;
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter the size of row ");
        r = sc.nextInt();
        System.out.print("Enter the size of column ");
        c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.print("Enter the array element ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Print the original element ");
        printArray(matrix);
        System.out.println();
        System.out.print("Print sum of suffix array row wise ");
        suffixArrayRowWise(matrix);
        printArray(matrix);
        System.out.println();
        System.out.print("Print the sum of suffix array column wise ");
        suffixArrayAfterRowWiseSumColumn(matrix);
        printArray(matrix);
    }
}
