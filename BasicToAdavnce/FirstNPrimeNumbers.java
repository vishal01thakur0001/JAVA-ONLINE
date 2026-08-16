import java.util.Scanner;
public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrime = true;

            for(int i = 2; i < num;i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(num + " ");
                count++;
            }
            num++;
            sc.close();
        }
        
    }

}
