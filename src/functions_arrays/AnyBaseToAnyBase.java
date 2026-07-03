package functions_arrays;

public class AnyBaseToAnyBase {
    private static int getAnyBase(int num, int base1, int base2){
        int number = 0;
        int counter = 0;
        while(num != 0){
            int reminder = num % base2;
            num = num / base2;
            number += reminder * Math.pow(base1,counter);
            counter++;
        }
        return number;
    }
    public static void main() {
        AnyBaseToAnyBase abd = new AnyBaseToAnyBase();
        System.out.println(abd.getAnyBase(57,10,2));
    }
}
