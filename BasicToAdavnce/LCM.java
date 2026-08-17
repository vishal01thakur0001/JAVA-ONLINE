import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        int lcm;
        if (a > b) {
            lcm = a;
        }else{
            lcm = b;
        }
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM : " + lcm);
        sc.close();
    }
}
