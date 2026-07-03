package functions_arrays;

public class DecimalToAnyBase {

    private static int getDecimalValue(int num, int base){
        int decimalNumber = 0;
        int counter = 0;
        while(num != 0){
            int reminder = num % base;
            num = num / base;
            decimalNumber += reminder * Math.pow(10,counter);
            counter++;
        }
        return decimalNumber;
    }
   public static void main() {
       DecimalToAnyBase dab = new DecimalToAnyBase();
       System.out.println(dab.getDecimalValue(57,2));
    }
}
