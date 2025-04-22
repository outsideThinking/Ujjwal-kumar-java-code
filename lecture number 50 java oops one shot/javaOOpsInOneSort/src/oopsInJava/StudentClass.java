package oopsInJava;

public class StudentClass {

    public static class student{
        String name;
        int age;
        double percentage;
    }
    public static void main(String[] args) {

        student x = new student();
        x.name="ujjwal";
        x.age=22;
        x.percentage=98.5;

        System.out.println(x.name);
    }
}
