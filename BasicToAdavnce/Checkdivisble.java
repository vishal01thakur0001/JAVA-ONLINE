import java.util.Scanner;
public class Checkdivisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
         if(a % 3 == 0 && a % 5 == 0){
             System.out.println("Divisble BY Both 3 AND 5 : ");
         }else {
            System.out.println("Not divisble BY Both 3 AND 5 : ");
         }
         sc.close();
    }
    
}
