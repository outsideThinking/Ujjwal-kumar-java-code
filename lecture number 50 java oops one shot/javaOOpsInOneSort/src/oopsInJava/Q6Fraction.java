package oopsInJava;

public class Q6Fraction {
    public static class fraction{
        int num;
        int dem;
        //constructor
        public fraction(int num, int dem){
            this.num=num;
            this.dem=dem;
        }

        //function

    }
    public static void main(String[] args) {
        fraction f1=new fraction(3,7);
        System.out.println(f1.num+"/"+f1.dem);

        fraction f2=new fraction(7,3);
        System.out.println(f2.num+"/"+f2.dem);
    }
}
