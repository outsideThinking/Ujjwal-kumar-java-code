import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.print("Enter the day ");
        day=sc.nextInt();
        switch (day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thrusday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
                case 7:
                System.out.print("sunday");
                break;
        }
    }
}
