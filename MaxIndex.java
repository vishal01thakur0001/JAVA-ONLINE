public class MaxIndex {
    public static void main(String[] args) {
        int[] numbers = {23, 67, 12, 89, 45};
        int max = numbers[0];
        int MaxIndex = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                 max = numbers[i];
                 MaxIndex = i;            }
        }
        System.out.print("Max number : " +  max  + " MaxIndex : " + MaxIndex);
    }
}
