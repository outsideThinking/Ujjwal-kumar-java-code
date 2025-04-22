import java.util.Scanner;
class qn2AdditionOfTwoMatrices{
    static void add(int [][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1!=r2 || c1!=c2){ //condition write down
            System.out.print("Adding is not possible ");
            return;
        }
        int [][] sum=new int[r1][c1]; //adding of code id write down
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(sum); //printmatrix of function is calling
    }
    static void printMatrix(int [][] arr){ //print matrix of function is create
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(" ");
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.print("Enter the row of size  ");
        r1=sc.nextInt();
        System.out.print("Enter the colum of size ");
        c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.print("Enter the first matrix of element ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int r2,c2;
        System.out.print("Enter the row of size ");
        r2=sc.nextInt();
        System.out.print("Enter the coloum of size ");
        c2=sc.nextInt();
        int[][]  b=new int[r2][c2];
        System.out.print("Enter the second matrix of element ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.print("Print first matrix ");
        for(int i=0;i<r1;i++){
            System.out.println();
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]);
            }
        }
        System.out.println();
        System.out.print("Print second matrix ");
        for(int i=0;i<r2;i++){
            System.out.println();
            for(int j=0;j<c2;j++){
                System.out.print(b[i][j]);
            }
        }
        System.out.println();
        System.out.print("Print after adding matix ");
        add(a,r1,c1,b,r2,c2); // calling the adding function
    }
}