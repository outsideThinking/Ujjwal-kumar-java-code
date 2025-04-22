import java.util.Scanner;
class oneToNofSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num=sc.nextInt();
        int i=1;
        int sum=0;
        while(num>=i){
            sum=sum+i;
            i++;
        }
        System.out.print(sum);
    }

        }