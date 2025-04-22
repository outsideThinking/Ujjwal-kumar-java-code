import java.util.Scanner;
public class threePointsOnaLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=1,x2=2,x3=3;
        int y1=1,y2=2,y3=3;
        int m1=(y2-y1)/(x2-x1);
        int m2=(y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("The points lie on a single line ");
        }
        else{
            System.out.println("They do not lie on a single line ");
        }
    }
}
