package Array;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > Largest){
               SecondLargest = Largest;
            }else if(arr[i] > SecondLargest && arr[i] != Largest) {
                SecondLargest = arr[i];
            }
        }
        
    }
}
