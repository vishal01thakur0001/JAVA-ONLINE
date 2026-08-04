 import java.util.Scanner;
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter Number :");
         int a = sc.nextInt();

         System.out.print("Enter Number :");
         int b = sc.nextInt();

          a = a + b;
          b = a - b;
          a = a - b;
          
          System.out.println("After Swaping :");
          System.out.println("First Number :" + a);
           System.out.println("Seccond Number :" + b);

           sc.close();

    }
    
}
