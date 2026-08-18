import java.util.Scanner;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int Square = i * i;
            sum = sum + Square;
        }
        System.out.print(sum);
        sc.close();

    }
}
