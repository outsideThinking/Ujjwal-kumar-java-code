import java.util.Scanner;
public class studentOfmarksPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int phy,che,math,english,hindi;
        System.out.print("Enter the student of phy of marks ");
        phy=sc.nextInt();
        System.out.print("Enter the student of che of marks ");
        che=sc.nextInt();
        System.out.print("Enter the student of math of marks ");
        math=sc.nextInt();
        System.out.print("Enter the student of english of marks ");
        english=sc.nextInt();
        System.out.print("Enter the student of hindi of marks ");
        hindi=sc.nextInt();
        int percentage=(phy+che+math+english+hindi)/5;
        System.out.println(percentage);
        if(percentage>=90){
            System.out.print("it is excellent marks ");
        }
        else if(percentage>=80){
            System.out.print("It is very good marks ");
        }
        else if(percentage>=70){
            System.out.print("It is good marks ");
        }
        else if(percentage>=60){
            System.out.print("It is average marks ");
        }
        else if(percentage>=50){
            System.out.print("It is below average marks ");
        }
       else{
           System.out.print("it is fail ");
        }
    }
}
