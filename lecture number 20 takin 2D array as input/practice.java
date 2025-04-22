import javax.swing.*;
import java.util.Scanner;
public class practice {

    static void printArray(int[][] arr, int row, int colum){
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void multiplicationArray(int[][]a, int r1, int c1, int[][]b, int c2, int r2){
        if(r1!=c2){
            System.out.println("Multiplication not possible ");
            return;
        }
        int[][] multi=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    multi[i][j]=multi[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        printArray(multi, r1, c2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.println("Enter the size of rows: ");
        r1=sc.nextInt();
        System.out.println("Enter the size of colum: ");
        c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter the first array element: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2,c2;
        System.out.println("Enter the size of rows: ");
        r2=sc.nextInt();
        System.out.println("Enter the size of colum: ");
        c2=sc.nextInt();
        System.out.println("Enter the second array element: ");
        int[][] b=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        multiplicationArray(a,r1,c1,b,r2,c2);
    }
}