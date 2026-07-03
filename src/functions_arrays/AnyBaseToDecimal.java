package functions_arrays;

public class AnyBaseToDecimal {
    private static int getAnyBase(int num, int base){
        int decimalNumber = 0;
        int counter = 0;
        while(num != 0){
            int reminder = num % 10;
            num = num / 10;
            decimalNumber += reminder * Math.pow(base,counter);
            counter++;
        }
        return decimalNumber;
    }
    public static void main() {
        AnyBaseToDecimal abd = new AnyBaseToDecimal();
        System.out.println(abd.getAnyBase(111001,2));
    }
}
