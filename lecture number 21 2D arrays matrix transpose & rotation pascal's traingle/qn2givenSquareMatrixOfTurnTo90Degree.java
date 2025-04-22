/* qn2   Give a square matrix turn it by 90 degree in a clockwise direction
 without using any extra space */

import java.util.Scanner;
public class qn2givenSquareMatrixOfTurnTo90Degree {
    static void transposeMatrix(int[][]matrix){ // transpose matrix of code
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void printMatrix(int[][]matrix){ // print matrix of code
        int n=matrix.length;
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    static void reverseArray(int [] arr){ // reverse array of code
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix){ // rotate array of code
        transposeMatrix(matrix);
        for(int i=0;i<matrix.length;i++){
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter the square matrix of size ");
        size=sc.nextInt();
        int[][]matrix=new int[size][size];
        System.out.print("Enter the matrix of element ");
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix.length;j++){
              matrix[i][j]=sc.nextInt();
          }
        }
        System.out.print("Print the original matrix ");
        printMatrix(matrix);
        System.out.println();
        System.out.print("Print the transpose matrix ");
        transposeMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        System.out.print("After the rotation 90 degree array is make them ");
        rotate(matrix);
        printMatrix(matrix);
    }
}
