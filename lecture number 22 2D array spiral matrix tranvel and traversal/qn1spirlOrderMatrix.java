//qn1 Give an N*M matrix 'a' return all elements of the matrix in spiral order


import java.util.Scanner;
public class qn1spirlOrderMatrix {
    static void printArray(int [][]matrix){ // print array of function
        for(int i=0;i<matrix.length;i++){
            System.out.println();
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    static void printSpiralMatrix(int[][]matrix, int r, int c){ // spiral matrix print of code
        int topRow=0; int bottomRow=r-1; int rightCom=c-1;int leftCol=0;
        int totalElement=0;

        while(totalElement<r*c){
            //topRow  -> left to right
            for(int j=leftCol;j<=rightCom && totalElement<r*c;j++){ //&&total element is less than r*c
                System.out.print(matrix[topRow][j]+" ");        //tab hi loop me enter karo
                totalElement++;
            }
            topRow++;
            //rightCol -> top to bottom
            for(int i=topRow;i<=bottomRow && totalElement<r*c;i++){
                System.out.print(matrix[i][rightCom]+" ");
                totalElement++;
            }
            rightCom--;
            //bottomRow ->right to left
            for(int j=rightCom;j>=leftCol && totalElement<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            //leftCol ->bottom to top
            for(int i=bottomRow;i>=topRow && totalElement<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElement++;
            }
                leftCol++;
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
        System.out.print("Enter the matrix of element ");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
            System.out.print("Print the matrix of element ");
            printArray(matrix);
            System.out.println();
            System.out.print("Print the spiral element ");
            printSpiralMatrix(matrix, r, c);

    }
}
