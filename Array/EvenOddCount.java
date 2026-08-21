package Array;
import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int n =sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;

        for(int i = 0; i <n; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even Elements : " + even);
        System.out.println("Number of Odd Elements : " + odd);
        sc.close();
    }
}
