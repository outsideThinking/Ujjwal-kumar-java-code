public class traversingForLoop {
    void demo(){
        int [] age= new int [5];
        age[0]=2;
        age[1]=9;
        age[2]=6;
        age[3]=89;
        age[4]=45;
        for(int i=0;i<5;i++){
            System.out.println(age[i]);
        }
    }
    public static void main(String[] args){
        traversingForLoop obj=new traversingForLoop();
        obj.demo();
    }
}
