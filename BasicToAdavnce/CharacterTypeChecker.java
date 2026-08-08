import java.util.Scanner;
public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value :");
        char a = sc.next().charAt(0);

        if(a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z'  ){
            System.out.print(a + " : It is a Alphabet");

        }else if(a >= '0' && a <= '9'){
            System.out.print(a + " : It is a Digit ");
        }else{
            System.out.println(a + " : It is a Symbol ");
        }
        sc.close();
    }
}
