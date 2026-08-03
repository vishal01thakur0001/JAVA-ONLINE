package BasicToAdavnce;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  temperature in Celcius :");
        int C = sc.nextInt();

        double fahrenheit = (9.0/5 )*C+32;
        System.out.println("After convert into Fahrenhirt :");
        System.err.print("fahrenheit :" + fahrenheit);
        sc.close();

    }
}
