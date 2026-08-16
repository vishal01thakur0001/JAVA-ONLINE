import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int orginal = i;
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
                
            }
            if(orginal == sum){
                System.out.print(orginal + " ");
            }
        }
        sc.close();
    }
}
