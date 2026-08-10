import java.util.Scanner;
public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int reverse = 0;
        for(int i = 0; n > 0;i++){
            int digit = n % 10;
             n = n / 10;
            reverse = reverse * 10 + digit;
        }
         for(int i = 1; reverse > n; i++){
            int digit = reverse % 10; 
            reverse = reverse / 10;
                System.out.println(digit);

            }
            sc.close();
             
    }
}
