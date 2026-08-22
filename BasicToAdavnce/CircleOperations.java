 import java.util.Scanner;
public class CircleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER RADIUS :");
        int Radius = sc.nextInt();

        System.out.println("AREA :" + (Math.PI*Radius*Radius));
        System.out.println("Circumference :" + (2 * Math.PI *Radius));

        sc.close();
    }
}
