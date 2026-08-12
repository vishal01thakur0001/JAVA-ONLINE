import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digits : ");
        int a = sc.nextInt();
        int sum = 0;
       while(a > 0){
        int lastdigit = a % 10;
        sum = lastdigit + sum;
        a = a / 10;
       }
        
        System.out.println(sum);
        sc.close();
    }
}
