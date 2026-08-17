import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n = sc.nextInt();
        int orginal = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = digit + sum;
            n = n /10;
        }
        if (orginal % sum == 0) {
            System.out.print(orginal + " : It is an Harshad Number");
        }else{
              System.out.print(orginal + " : It is not an Harshad Number");
        }
        sc.close();
    }
}
