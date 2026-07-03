package functions_arrays;

public class DigitFrequency {
    private static int getFrequency(int num, int target){
        int counter = 0;
        while(num != 0){
            int reminder = num % 10;
            if(reminder == target){
                counter++;
            }
            num = num/10;
        }
        return counter;
    }
    public static void main() {
        DigitFrequency df = new DigitFrequency();
        System.out.println(df.getFrequency(994543234,4));
    }
}
