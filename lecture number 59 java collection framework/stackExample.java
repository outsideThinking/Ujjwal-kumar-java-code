import java.util.Stack;

public class stackExample {
    static void stackEx(){
        Stack<String> str=new Stack<>();

        str.push("ujjwal");
        str.push("ram");
        str.push("Shyam");
        str.push("mohan");

        System.out.println(str); //ujjwal, ram, shyam, mohan

        str.pop();
        System.out.println(str); //last element is deleted

        System.out.println(str.peek()); //shyam

        System.out.println(str.size());

        System.out.println(str.empty()); //false
    }

    public static void main(String[] args) {
        stackEx();

    }
}
