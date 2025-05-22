import java.util.Scanner;

public class qn02stringIntchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str="abc";
//        str=str+"def";
//        System.out.println(str);
        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc"); //because they runs left to right
    }
}
