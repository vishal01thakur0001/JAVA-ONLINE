import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= y; i++){
            result = result * x;
        }
        System.out.print(result);
        sc.close();
    }
}
