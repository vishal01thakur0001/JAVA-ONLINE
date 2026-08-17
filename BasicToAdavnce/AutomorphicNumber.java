import java.util.Scanner;
public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        int n = sc.nextInt();

        int orginal = n;
        int square = n * n;
        int temp = n;
        int digit = 0;

        while (temp > 0) {
            digit++;
            temp = temp / 10;
        }
        int divisor = 1;

        for(int i = 1; i <= digit; i++){
            divisor = divisor * 10;
        }
        if(square % divisor == orginal){
            System.out.print(orginal + " : It is an Automorphic Number ");
        }else{
             System.out.print(orginal + " : It is not an Automorphic Number ");
        }
        sc.close();
    }
}