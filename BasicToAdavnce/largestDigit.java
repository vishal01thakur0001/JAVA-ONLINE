import java.util.Scanner;
public class largestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int n = sc.nextInt();
        int Digit = 0;
        int max = 0;
        while(n > 0){
            Digit = n % 10;
               n = n / 10;
               if(Digit > max){
                max = Digit;
               }
           
    }
    System.out.println("Largest Digit : " + max);
    sc.close();
}
}
