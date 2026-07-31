package Class_1;

public class secondlastdigit {
    public static void main(String[] args) {
        int num = 25864;
        int secondlast = num % 100;
        System.out.println("Second Last Digit :" + secondlast);

        int remaining = num / 100;
        System.out.println("Remaining :" + remaining);
    }
    
}
