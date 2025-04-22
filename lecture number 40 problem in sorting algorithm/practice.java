import java.util.Scanner;
class practice{
    static void sortLexicograpicalOrder(String [] fruits){
        int n=fruits.length;
        for(int i=0;i<n;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minIdx])<0){
                    minIdx=j;
                }
            }
            String temp=fruits[i];
            fruits[i]=fruits[minIdx];
            fruits[minIdx]=temp;
        }
    }
    static void printFruitsName(String [] fruits){
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the array of size ");
        size=sc.nextInt();
        String [] fruits=new String[size];
        System.out.println("Enter the fruit name ");
        for(int i=0;i<size;i++){
            fruits[i]=sc.nextLine();
        }
    sortLexicograpicalOrder(fruits);
        printFruitsName(fruits);
    }
}