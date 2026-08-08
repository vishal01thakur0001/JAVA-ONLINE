import java.util.Scanner;
public class Eligibletovote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int a = sc.nextInt();
        if(a >= 18){
            System.out.print("Eligble To Vote : ");
        }else{
            System.out.print("Not Eligble to Vote : ");
        }
        sc.close();
    }
}
