public class multidimensionalLength {
    void arrayLength(){
        int [] []arr={{1,2,3,5},{23,54,56,34}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
        multidimensionalLength obj=new multidimensionalLength();
        obj.arrayLength();
    }
}
