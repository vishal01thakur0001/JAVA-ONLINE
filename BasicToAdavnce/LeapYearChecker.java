import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year : ");
        int y = sc.nextInt();

        if(y % 4 == 0 && y % 100 != 0 ){
            System.out.println(y + " : Is a LeapYear");
        }else{
            System.out.println(y + " : Is Not a LeapYear");
        }
        sc.close();
    }
}
