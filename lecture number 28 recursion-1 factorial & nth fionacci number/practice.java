import java.util.Scanner;
class practice{
 static int fib(int num){
     if(num==0 || num==1)
         return num;
     int pre=fib(num-1);
     int prePre=fib(num-2);
     return pre+prePre;
 }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num=sc.nextInt();
        System.out.print(fib((num)));
    }
}