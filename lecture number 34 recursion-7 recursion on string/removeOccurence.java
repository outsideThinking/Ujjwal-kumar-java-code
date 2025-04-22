import java.util.Scanner;
public class removeOccurence {
    static String removeOccu(String s, int idx){
        if(idx==s.length()) return"";
        String smallPro=removeOccu(s,idx+1);
        char currentChar=s.charAt(idx);
                if(currentChar!='a'){
                    return currentChar+smallPro;
                }
                else{
                    return smallPro;
                }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
    String ans=removeOccu(s,0);
        System.out.println(ans);
    }
}
