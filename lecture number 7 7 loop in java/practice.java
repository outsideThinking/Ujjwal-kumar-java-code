import java.util.Scanner;
public class practice{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
     int decimal_num;
     decimal_num=sc.nextInt();
     int ans=0;
     int pow=1;
     while(decimal_num>0){
         int digit=decimal_num%2;
         ans=ans+(digit*pow);
         pow=(pow*10);
         decimal_num=decimal_num/2;
     }
     System.out.print(ans);
  }
}