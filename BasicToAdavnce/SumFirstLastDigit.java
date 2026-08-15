import java.util.Scanner;
public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Value : ");
        int n = sc.nextInt();
        int sum = 0;
        int lastdigit = n % 10;
        while (n >= 10) {
            n = n / 10;
         sum = n + lastdigit;
        }
        sum = n + lastdigit;
        System.out.println(sum);
        sc.close();

        
    }
}
