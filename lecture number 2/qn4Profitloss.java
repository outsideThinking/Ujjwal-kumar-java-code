import java.util.Scanner;
public class qn4Profitloss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cost_price,Selling_price;
        System.out.print("Enter the cost price ");
        cost_price=sc.nextInt();
        System.out.print("Enter the Selling price ");
        Selling_price=sc.nextInt();
        int profit=cost_price-Selling_price;
        if(profit>0){
            System.out.print("It is profit "+profit);
        }
        else{
            System.out.print("It is loss "+profit);
        }
    }
}
