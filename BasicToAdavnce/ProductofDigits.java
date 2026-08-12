import java.util.Scanner;
public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digits : ");
        int n = sc.nextInt();
        int product = 1;
        while(n > 0){
            int lastdigit = n % 10;
             product = product * lastdigit;
             n = n /10;
        }
        System.out.println(product);
        sc.close();
    }
}
