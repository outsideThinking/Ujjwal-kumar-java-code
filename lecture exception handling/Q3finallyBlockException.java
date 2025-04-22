public class Q3finallyBlockException {
    public static void main(String[] args) {
        int[] arr=new int[5];
        System.out.println("Hello guys");
        try {
            System.out.println(arr[3]);
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will always run");
        }
        System.out.println("Bay guys");
    }
}
