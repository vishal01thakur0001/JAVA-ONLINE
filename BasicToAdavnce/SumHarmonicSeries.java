import java.util.*;
public class SumHarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1.0 / i ;
        }
        System.out.print(sum);
        sc.close();
    }
}
