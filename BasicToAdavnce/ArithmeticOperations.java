package BasicToAdavnce;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number :");
    int a = sc.nextInt();

    System.out.print("Enter Number :");
    int b = sc.nextInt();

    System.out.println("Sum :" + (a + b));
    System.out.println("Difference :" + (a - b));
    System.out.println("Multiply :" + (a * b));
    System.out.println("Divide :" + (a / b));

    sc.close();
    }
    
}


