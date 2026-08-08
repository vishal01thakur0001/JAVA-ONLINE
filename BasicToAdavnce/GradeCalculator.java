import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int a = sc.nextInt();

        if(a >= 90 && a <= 100){
            System.out.println(" Grade A : " + a);
            
        }else if(a >= 70 && a < 90 ){
                   System.out.print("Grade B : " + a);
            }
        else if( a >= 40 && a < 70){
                System.out.print("Grade C : " + a);
            }else{
                System.out.println("Grade F : " + a);
            }
            sc.close();
    }
}
