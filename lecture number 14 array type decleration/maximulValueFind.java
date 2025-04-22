public class maximulValueFind {
    void maximum(){
        int [] arr={23,43,23,3,4,23,54,23,67,43};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            }

        }
        System.out.print(max);
    };
    public static void main(String[] args){
        maximulValueFind obj=new maximulValueFind();
        obj.maximum();
    }
}
