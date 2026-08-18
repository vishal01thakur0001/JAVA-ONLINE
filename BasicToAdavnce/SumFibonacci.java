import java.util.Scanner;
public class SumFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum = " + sum );
        sc.close();
    }
}
