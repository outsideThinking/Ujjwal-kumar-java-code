import java.util.Scanner;
class practice{
    static String reverse(String s, int idx){
        if(idx==s.length()) return " ";
        String smallAns=reverse(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the string ");
        s=sc.nextLine();
        String ans=reverse(s,0);
        System.out.println(ans);
    }
}