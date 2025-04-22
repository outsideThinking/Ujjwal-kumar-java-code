public class forEachLoop {
    void demo(){
        int [] ages=new int[6];
        ages[0]=65;
        ages[1]=34;
        ages[2]=45;
        ages[3]=23;
        ages[4]=54;
        ages[5]=45;
        for(int age:ages){
            System.out.println(age);
        }
    }
    public static void main(String[] args){
        forEachLoop obj=new forEachLoop();
        obj.demo();
    }
}
