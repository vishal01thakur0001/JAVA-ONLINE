import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Enter NUumber : ");
        int b = sc.nextInt();

       int temp = a;
       a = b;
       b = temp;

       System.out.println("After Swaping :");
       System.out.println("First number : " + a);
       System.out.println("Second number : " + b);
          sc.close();

    }
}
