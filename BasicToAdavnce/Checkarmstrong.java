import java.util.Scanner;
public class Checkarmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n = sc.nextInt();
        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
            
        }
        if (orignal == sum) {
            System.out.println( orignal + " : It is Armstrong " );
        }else{
            System.out.println( orignal + " :  It is not Armstrong ");
        }
        sc.close();
    }
}