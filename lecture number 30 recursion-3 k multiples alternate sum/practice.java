import java.util.Scanner;
class practice{
    static int alternativeSum(int num){
        if(num==1) return 1;
        if(num%2==0) {
            return alternativeSum(num - 1) - num;
        }
        else {
            return alternativeSum(num - 1) + num;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the value of num ");
        num=sc.nextInt();
       int ans=alternativeSum(num);
        System.out.println(ans);
    }
}