/* Give a matrix 'a' of dimension N*M and 2 coordinates (l1,r1)
and (l2,r2) return the sum of the rectangle from l1,r1, to l2 r2
 */

import java.util.Scanner;
public class qn1SumOfRectangle {
    static int sumOfRectangle(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){   //sum of rectangle of formula
            for(int j=r1;j<=r2;j++){
                sum=sum+matrix[i][j];
            }
        }
        System.out.print(sum);
        return sum;
    }
    static void printMatrix(int [][]matrix){ //print matrix of code
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.print("Enter the row ");
        r=sc.nextInt();
        System.out.print("Enter the colum ");
        c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.print("Enter the matrix of element ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int l1,r1,l2,r2;
        System.out.print("Enter the first coordinate of l1, r1 of value ");
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.print("Enter the second coordinate of l2,r2 of value ");
        l2=sc.nextInt();
        r2=sc.nextInt();
        System.out.print("Print original matrix ");
        printMatrix(matrix);
        System.out.println();
        System.out.print("Print coordinate of sum matrix ");
        sumOfRectangle(matrix,l1,r1,l2,r2);
    }
}
