import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.print("Even : " + a);
        }else{
            System.out.print("Odd : " + a);
        }
        sc.close();
    }
}
