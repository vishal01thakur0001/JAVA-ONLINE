package Array;
import java.util.Scanner;
public class ReadAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elemnts are : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
