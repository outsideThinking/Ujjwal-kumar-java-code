//qn3 Method:3 prefix sum over columns and row both

import java.util.Scanner;
public class prefixSumRowWiseAndColumWise {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    // calculate row-wise and colum-wise sum
    static void rowWiseColumWisePrefixSum(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally to calculate sum row wise
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }
        }
        // traverse vertically to calculate sum colum wise
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]=matrix[i][j]+matrix[i-1][j];
            }
        }
    }
    // rectangle sum calculate of code
    static int rectangleOfSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans=0, sum=0, left=0,up=0,leftUp=0;
        rowWiseColumWisePrefixSum(matrix);
        sum=matrix[l2][r2];
        if(r1>=1)
            left=matrix[l2][r1-1];
        if(l1>=1)
            up=matrix[l1-1][r2];
        if(l1>=1 && r1>=1)
            leftUp=matrix[l1-1][r1-1];
        ans=sum-up-left+leftUp;
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.print("Enter the size of row ");
        r=sc.nextInt();
        System.out.print("Enter the size of colum ");
        c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.print("Enter the array element ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int l1,r1,l2,r2;
        System.out.print("Enter the first coordinate ");
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.print("Enter the second coordinate ");
        l2=sc.nextInt();
        r2=sc.nextInt();
        System.out.print("Print the original matrix ");
        printMatrix(matrix);
        System.out.println();
        System.out.print("Print rectangle of sum ");
        int sum1=rectangleOfSum(matrix,r1,l1,r2,l2);
        System.out.print(sum1);
    }
}