import java.util.Scanner;
public class qn10YoungestAgeFind {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int ram_age,shyam_age;
     int ajay_age;
     System.out.print("Enter the ram of age ");
     ram_age=sc.nextInt();
     System.out.print("Enter the shyam of age ");
     shyam_age=sc.nextInt();
     System.out.print("Enter the ajay of age ");
     ajay_age=sc.nextInt();
     if(ram_age>shyam_age && ram_age>ajay_age){
         System.out.print("Youngest is ram ");
     }
     else if(shyam_age>ram_age && shyam_age>ajay_age){
         System.out.print("Youngest is shyam ");
     }
    else{
        System.out.print("Youngest is ajay ");
     }
    }
}
