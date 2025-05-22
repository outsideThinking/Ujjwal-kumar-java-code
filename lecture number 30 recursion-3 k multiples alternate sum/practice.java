import java.util.Scanner;
class practice{
    static int multipleNum(int num, int k){
        if(k/10==0)
            return k;
        multipleNum(num,k-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num: ");
        int num=sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println(multipleNum(num,k));
    }
}