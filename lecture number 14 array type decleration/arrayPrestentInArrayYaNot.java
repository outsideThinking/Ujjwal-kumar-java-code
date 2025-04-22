public class arrayPrestentInArrayYaNot {
    void checkPresentArray(){
        int [] arr={1,5,3};
        int x=5;
        int ans;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                 ans=i;
                System.out.print("it is present in  "+ans+ " index");
            }
        }

    }
    public static void main(String[] args){
        arrayPrestentInArrayYaNot obj=new arrayPrestentInArrayYaNot();
        obj.checkPresentArray();
    }
}
