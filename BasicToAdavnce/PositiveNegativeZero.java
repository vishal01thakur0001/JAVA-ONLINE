import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("Postive Number : " + a);
        }else if(a < 0){
            System.out.println("Negative number :" + a);      
        }
        else {
            System.out.println(" Zero : " + a);
        }
        
        sc.close();
    }
}
