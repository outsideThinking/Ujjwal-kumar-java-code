import java.util.Scanner;
public class qn1ArrayOfInitialization2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.print("Enter the array element ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Print the array element ");
        for(int i=0;i<arr.length;i++){
            System.out.println(" ");
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i] [j]);

            }
        }
    }
}
