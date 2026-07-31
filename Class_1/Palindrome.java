package Class_1;

public class Palindrome {
    public static void main(String[] args) {
        int num = 152;
        int orignal = num;
        int reverse = 0;

        while(num > 0 ){
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num /10;
        }
        if(orignal == reverse){
                  System.out.print("Palindrome");
        }else{
                  System.out.println("not Palindrome");  
        }
    }
        }
