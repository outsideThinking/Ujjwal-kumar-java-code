package oopsInJava;

public class Q1ClassPassInFunction {

        //class pass in function

        public static class student{
            String name;
            int age;
            double percentage;
        }

        public static void fun(String x){
            System.out.println(x);

        }

        public static void main(String[] args) {

            student s=new student();
            s.name="ujjwal";
            s.age=24;
            s.percentage=78.6;

            fun(s.name);
        }
    }
