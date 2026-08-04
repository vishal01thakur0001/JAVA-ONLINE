import java.util.Scanner;
public class RectangleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length :");
        int L = sc.nextInt();

        System.out.print("Enter breadth :");
        int B = sc.nextInt();

         System.out.println("Area :" + (L * B));
         System.out.println("Preimeter :" + (2 * (L + B)));

         sc.close();
    }
}
