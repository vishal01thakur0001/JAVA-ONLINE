package Class_1;
public class maxarray {
    public static void main(String[] args) {
        int[] numbers = {120 , 56 , 89, 250, 60};
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
            max = numbers[i];
        }
    }
         System.out.print(max);
}
}
