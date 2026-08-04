import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("ENTER THE SECONDS :");
        int seconds = sc.nextInt();
          
        double Hours = seconds / 3600;
        double mintues = (seconds % 3600) / 60;
        double remainingSeconds = seconds % 60; 

        System.out.println("After Convter into Seconds :");

        System.out.println("Hours :" + Hours);
        System.out.println("Mintues :" + mintues);
        System.out.println("RemainingSeconds :" + remainingSeconds);

        sc.close();
    }
}
