import java.util.ArrayList;

public class qn1ArrayList {
    static void arrayListExample(){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(3);
        al.add(7);
        al.add(8);
        System.out.println(al);
        System.out.println(al.get(1)); //1 based indexing
        al.set(1,9); //modified at index 1
        System.out.println(al);
    }
    public static void main(String[] args) {
    arrayListExample();
    }
}
