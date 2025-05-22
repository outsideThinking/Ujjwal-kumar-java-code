import java.util.Scanner;
class practice{
    static void multiplicationMatrix(int[][] matrix1, int r1, int c1, int[][] matrix2, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Multplication is not possible");
            return;
        } else {
            int[][] ans = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for(int k=0;k<c1;k++){
                        ans[i][j]=ans[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.println("Enter the first matrix of row: ");
        r1=sc.nextInt();
        System.out.println("Enter the second matrix of colum: ");
        c1=sc.nextInt();
        int[][] matrix1=new int[r1][c1];
        System.out.println("Enter the first matrix of element: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix of row: ");
       int r2=sc.nextInt();
        System.out.println("Enter the second matrix of colum: ");
        int c2=sc.nextInt();
        int[][] matrix2=new int[r2][c2];
        System.out.println("Enter the second matrix of element: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
    }
}