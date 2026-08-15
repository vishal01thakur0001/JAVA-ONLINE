import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        int orginal = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
            
        }
        if(orginal == reverse){
            System.out.println("It is palindrome : " + orginal );
        }else{
            System.out.println("It is not palindrome : " + orginal);
        }
        sc.close();
    }
}
