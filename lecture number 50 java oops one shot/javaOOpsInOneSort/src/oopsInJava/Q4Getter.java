package oopsInJava;

public class Q4Getter {
    public static void main(String[] args) {

        Q4getter1 s1=new Q4getter1();
        s1.name="ujjwal";
        System.out.println(s1.getAge());

        //there is set the private variable of value

        System.out.println(s1.setName("ujjwal"));
    }
}
