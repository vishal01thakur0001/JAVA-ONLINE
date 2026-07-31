package Class_1;

public class lastdigit {
    public static void main(String[] args){
    int num = 85235;
    int lastdigit = num % 10;
    System.out.println("Second Last :" + lastdigit);

    int remaining = num / 10;
    System.out.println("Reaining :" + remaining);
    }
    
}
