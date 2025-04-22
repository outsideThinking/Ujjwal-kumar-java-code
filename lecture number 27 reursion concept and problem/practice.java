import java.util.Scanner;
class practice{
    public static void naturalNum(int num){
        if(num==0)
            return;
        System.out.print(num+" ");
        naturalNum(num-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num: ");
        int num=sc.nextInt();
        naturalNum(num);
    }
}