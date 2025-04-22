public class sumOfArray {
    void sum(){
        int [] arr={1,5,3};
        int sum=0;
        for(int i=0;i<3;i++){
            sum=sum+arr[i];
        }
        System.out.print("sum is "+sum);
    }
    public static void main(String[] args){
        sumOfArray obj=new sumOfArray();
        obj.sum();
    }
}
