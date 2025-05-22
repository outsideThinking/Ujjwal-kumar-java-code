import java.util.Scanner;
class practice{
    static void naturalNum(int num){
        if(num==0)
            return;
        System.out.print(num+" ");
        naturalNum(num-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num: ");
        num=sc.nextInt();
        naturalNum(num);
    }
}