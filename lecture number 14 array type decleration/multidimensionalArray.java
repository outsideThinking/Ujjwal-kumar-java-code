public class multidimensionalArray {
    void multidimensional(){
        int [][] arr={{34,45,23,}, {3,5,6,}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args){
multidimensionalArray obj=new multidimensionalArray();
obj.multidimensional();
    }
}
