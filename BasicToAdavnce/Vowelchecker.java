import java.util.Scanner;
public class Vowelchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Charater : ");
        char a = sc.next().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                System.out.println(a + " : It is a Vowel ");
        }else{
            System.out.println(a + "It is a Constant ");
        }
        sc.close();
    }
    
}
