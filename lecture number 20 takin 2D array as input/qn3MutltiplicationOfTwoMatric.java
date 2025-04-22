//qn3 write a program to display multiplication of two matrices
// entered by user
import java.util.Scanner;
public class qn3MutltiplicationOfTwoMatric {
    static void productOfMatrix(int[][]a, int r1, int c1, int[][]b,int r2, int c2){
        if(c1!=r2){
            System.out.print("multiplication is not possible ");
            return;
        }
        int[][]pro=new int[r1][c2]; //multiplication of code
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    pro[i][j]=pro[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        printMatrix(pro, r1,c2);
    }
    static void printMatrix(int [][] arr, int r, int c){ //create array print method
        for(int i=0;i<r;i++){
            System.out.println();
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.print("Enter the size of row ");
        r1=sc.nextInt();
        System.out.print("Enter the size of coloum ");
        c1=sc.nextInt();
        int[][]a=new int[r1][c1];
        System.out.print("Enter the first matrix of element ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2,c2;
        System.out.print("Enter the size of row ");
        r2=sc.nextInt();
        System.out.print("Enter the size of coloum ");
        c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.print("Enter the second matrix of element ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
       System.out.print("Print first matrix ");
        printMatrix(a, r1,c1);
        System.out.println();
        System.out.print("Print second matrix ");
        printMatrix(b,r2,c2);
        System.out.println();
        System.out.print("Print the matrix of multiplication ");
        productOfMatrix(a,r1,c1,b,r2,c2);
    }
}
