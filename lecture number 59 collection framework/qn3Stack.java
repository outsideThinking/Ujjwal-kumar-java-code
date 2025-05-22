import java.util.Stack;

public class qn3Stack {
    static void stackExample(){
        Stack<String> s=new Stack<>();
        s.push("pw");
        s.push("skills");
        s.push("batch");
        System.out.println(s);
        System.out.println(s.peek()); //batch
        System.out.println(s.pop()); //read batch and also remove
        System.out.println(s.size()); //size of stack  2
        System.out.println(s.empty()); //is ask stack is empty or not  false
    }
    public static void main(String[] args) {
    stackExample();
    }
}
