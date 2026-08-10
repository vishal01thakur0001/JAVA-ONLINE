import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; n > 0 ;i++ ){
             count++; 
            n = n / 10;
        }
         System.out.print(count);
         sc.close();
    }
}
