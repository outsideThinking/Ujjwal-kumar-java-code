import java.util.Scanner;

public class rangeOfSumFind {
    static int RangeOfSum(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) { // Changed the loop condition
            sum += arr[i]; // Accumulate the sum
        }
        return sum; // Return the sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the size of array: ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int l, r;
        System.out.print("Enter the l value: ");
        l = sc.nextInt();
        System.out.print("Enter the r value: ");
        r = sc.nextInt();
        int result = RangeOfSum(arr, l, r); // Store the result in a variable
        System.out.println("Sum of elements in the range [" + l + ", " + r + "]: " + result);
    }
}
