public class traversingWhileLoop {
    void demo(){
        int [] ages=new int[5];
        ages[0]=34;
        ages[1]=45;
        ages[2]=67;
        ages[3]=45;
        ages[4]=43;
        int i=0;
        while(i<5){
            System.out.println(ages[i]);
            i++;
        }
    }
public static void main(String[] args){
        traversingWhileLoop obj=new traversingWhileLoop();
        obj.demo();

}
}
