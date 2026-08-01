public class minmum {
    public static void main(String[] args) {
        int[] numbers = {20 , 69 , 5 , 4 , 2};
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
            System.out.print(min);
    }
}
