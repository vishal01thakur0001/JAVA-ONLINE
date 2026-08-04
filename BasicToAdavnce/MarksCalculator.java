import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks of sub1 :");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of sub2 :");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of sub3 :");
        int sub3 = sc.nextInt();
        System.out.print("Enter the marks of sub4 :");
        int sub4 = sc.nextInt();
        System.out.print("Enter the marks of sub5 :");
        int sub5 = sc.nextInt();

       int Total  =  sub1 + sub2 + sub3 + sub4 + sub5;
       double Avrage = Total / 5.0;

       System.out.println("Total Marks :" + Total);
       System.out.println("Avrage :" + Avrage);

       sc.close();

    }
}
