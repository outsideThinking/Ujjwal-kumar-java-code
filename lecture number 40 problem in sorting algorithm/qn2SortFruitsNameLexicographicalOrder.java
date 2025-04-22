/*give an array of names of the fruits you are suppose to sort
it in lexicographical order using the selection sort
input:["papaya", "lime", "watermelon", "apple", "mango", "kiwi"]
output:["apple", "kiwi", "lime", "mango", "papaya", "watermelon"]
 */
import java.util.Scanner;
class qn2SortFruitsNameLexicographicalOrder{
    static void sortString(String[] str){
    int n=str.length;
    for(int i=0;i<n-1;i++){
        int minIndex=i;
        for(int j=i+1;j<n;j++){
            if(str[j].compareTo(str[minIndex])<0){
                minIndex=j;
            }
        }
        String temp=str[i];
        str[i]=str[minIndex];
        str[minIndex]=temp;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the string of size ");
        size=sc.nextInt();
        String[]str=new String[size];
        System.out.println("Enter the string element ");
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        sortString(str);
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}