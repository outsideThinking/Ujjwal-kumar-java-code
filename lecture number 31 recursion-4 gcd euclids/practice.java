import java.util.Scanner;
class practice{
    static int gdc(int x, int y){
        if(y==0) return x;
        return gdc(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x ");
        x=sc.nextInt();
        System.out.println("Enter the value of y ");
        y=sc.nextInt();
    }
}