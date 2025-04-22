//qn2 Give a positive integer n generate an N*N matrix filled with
// elements form 1 to n^2 in spiral order

import java.util.Scanner;
public class qn2filledSpiralOrderInElement {
    static int[][] createSpiralMatrix(int n){
        int [][]matrix=new int[n][n];
        int topRow=0, rightCol=n-1, bottomRow=n-1, leftCol=0;
        int currentVal=1;
        while(currentVal<=n*n){
            //topRow -> left to right
            for(int j=leftCol;j<=rightCol && currentVal<=n*n;j++){
                matrix[topRow][j]=currentVal++;
            }
            topRow++;
            //rightCol ->top to bottom
            for(int i=topRow;i<=bottomRow && currentVal<=n*n;i++){
                matrix[i][rightCol]=currentVal++;
            }
            rightCol--;
            //bottomRow ->right to left
            for(int j=rightCol;j>=leftCol && currentVal<=n*n;j--){
                matrix[bottomRow][j]=currentVal++;
            }
            bottomRow--;
            //leftCol ->bottom to top
            for(int i=bottomRow;i>=topRow && currentVal<=n*n;i--){
                matrix[i][leftCol]=currentVal++;
            }
            leftCol++;
        }
        return matrix;

    }
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the matrix of size ");
        n=sc.nextInt();
        int[][]matrix=createSpiralMatrix(n);
        printMatrix(matrix);
    }
}
