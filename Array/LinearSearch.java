package Array;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elemnets : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements to Search : ");
        int target = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Element not found ");
        }
        sc.close();
    }
}
