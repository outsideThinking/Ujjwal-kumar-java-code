//qn1 write a program to display transpose of matrix entered by the user
import java.util.Scanner;
public class qn1TransposeMatrix {
    static int[][] transposeMatrix(int [][]matrix, int r , int c){ //print matrix of function is create
        int [][] ans=new int[c][r];  // transpose matrix of code
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;

    }
    static void printMatirx(int [][] arr, int r, int c){ //print matrix of function is create
        for(int i=0;i<r;i++){
            System.out.println();
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
        }
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
        System.out.print("original matrix print ");
        printMatirx(matrix, r, c);
        System.out.println();
        System.out.print("print transpose matrix ");

        System.out.println();
        int [][] ans=transposeMatrix(matrix, r, c);
        printMatirx(ans,c,r);
    }
}
