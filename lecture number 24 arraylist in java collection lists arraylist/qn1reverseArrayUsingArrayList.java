//write a program to reverse the given ArrayList.
//input=[0,10,3,5,22,10]
//output=[10,2,5,3,10,0]
import java.util.ArrayList;
public class qn1reverseArrayUsingArrayList {
    static void reverseArray(ArrayList<Integer>list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.print("print the original array ");
        System.out.print(list);
        System.out.println();
        System.out.print("Print the reverse array ");
        reverseArray(list);
        System.out.print(list+" ");
    }
}
