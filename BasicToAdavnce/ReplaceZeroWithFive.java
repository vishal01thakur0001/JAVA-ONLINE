import java.util.Scanner;
public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int digit;
        int reverse = 0;
        int finalvalue = 0;
        while (n > 0) {
            digit = n % 10;
          if(digit == 0){
            digit = 5;
          }
          reverse = reverse * 10 + digit;
          n = n / 10;
            
        }
        while (reverse > 0) {
            digit = reverse % 10;
            finalvalue = finalvalue * 10 + digit;
            reverse = reverse / 10;
        }
        System.out.println(finalvalue);
        sc.close();
    }
}
