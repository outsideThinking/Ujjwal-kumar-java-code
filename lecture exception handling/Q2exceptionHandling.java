public class Q2exceptionHandling {
    public static void main(String[] args) {

        int[] arr=new int[5];
        System.out.println("Hello guys");

        //any type of exception we can handle we have no require to specified exception
        try {
           int result=5/0;
            System.out.println(arr[8]);
        } catch (Exception e){
            System.out.println("There is exception");
        }

        System.out.println("Bay guys");
    }
}
