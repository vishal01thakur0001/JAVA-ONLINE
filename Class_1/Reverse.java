package Class_1;

public class Reverse {
    public static void main(String[] args) {
        int num = 54321;
        int reverse = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;

            num = num / 10;
        }
       System.out.print(reverse);
    }
}
