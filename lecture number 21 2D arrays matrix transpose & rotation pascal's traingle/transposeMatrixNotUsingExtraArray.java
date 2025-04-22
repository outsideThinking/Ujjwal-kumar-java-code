//this is only applicable for square matrix
import java.util.Scanner;
public class transposeMatrixNotUsingExtraArray {
    static void transposeMatirx(int[][]matrix, int r,int c){ // transpose of matrix of code
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void printMatirx(int [][]arr, int r, int c){  //print matrix of code
        for(int i=0;i<r;i++){
            System.out.println();
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
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
        int [][]matrix=new int[r][c];
        System.out.print("Enter the first matrix of element ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("print the original matrix ");
        printMatirx(matrix, r,c);
        System.out.println();
        System.out.print("Print the transpose matrix ");
        System.out.println();
        transposeMatirx(matrix, r, c); //call the transpose matrix
        printMatirx(matrix,c,r);
    }
}
