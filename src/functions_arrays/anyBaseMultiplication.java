package functions_arrays;

public class anyBaseMultiplication {
    public static int anyBaseAddition(int b, int n1, int n2){
        int sum = 0;
        int carry = 0;
        int p = 0;
        while(n1 > 0 || n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int rem = (d1 + d2 + carry) % b;
            carry = (d1 + d2 + carry) / b;
            n1 /= 10;
            n2 /= 10;
            sum = sum + (int)Math.pow(10, p) * rem;
            p++;
        }

        if(p>0){
            sum = sum + (int)Math.pow(10, p) * carry;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int b = 8;
        int n1 = 2156;
        int n2 = 74;

        int product = 0;
        int pwr = 1;

        while(n2 > 0){
            int d2 = n2 % 10;
            int tempProduct = 0;
            int tempCarry = 0;
            int p = 0;

            while(n1 > 0 || tempCarry > 0){
                int d1 = n1 % 10;
                int rem  = ((d1 * d2) + tempCarry) % b;
                tempCarry = ((d1 * d2) + tempCarry) / b;
                tempProduct = tempProduct + (int)Math.pow(10, p) * rem;
                n1 /= 10;
                p++;
            }
            product = anyBaseAddition(b, product, tempProduct * pwr);
            n2 /= 10;
            pwr *= 10;
        }
        System.out.println(product);
    }
}
