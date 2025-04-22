import java.util.Scanner;
public class qn5RectangularOfArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length,breath;
        System.out.print("Enter the value of length ");
        length=sc.nextInt();
        System.out.print("Enter the value of breath ");
        breath=sc.nextInt();
        int area=length*breath;
        int perimeter=2*(length+breath);
        if(area>perimeter){
            System.out.print("area is greaterthan perimeter ");
        }
        else{
            System.out.print("perimeter is greater than area ");
        }
    }
}
