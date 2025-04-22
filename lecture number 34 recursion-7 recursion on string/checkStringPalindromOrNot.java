import java.util.Scanner;
public class checkStringPalindromOrNot {
    static boolean palindrom(String s, int l, int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && s.charAt(l+1)==s.charAt(r-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the string ");
        s=sc.nextLine();
        System.out.println(palindrom(s,0,s.length()-1));
    }
}
