import java.util.Scanner;
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int digit = 0;
        int min = n;
        while(n > 0){
            digit = n % 10;
            n = n / 10;
            if(min > digit){
                min = digit;
            }
        }
        System.out.println("Smallest Digit : " + min);
        sc.close();
    }
}
