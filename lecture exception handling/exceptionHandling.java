public class exceptionHandling {
    public static void main(String[] args){
        //exception handling
        int[] arr=new int[5];
        System.out.println("Hello guys");
        System.out.println(arr[4]);

        //there is using exception handling
        try {
            int result=5/0;
            System.out.println(arr[8]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("It is out of bounds");
        } catch(ArithmeticException e){
            System.out.println("There is arithmetic exception");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e);
        }


        System.out.println("Bay guys");
    }
}
