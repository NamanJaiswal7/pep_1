package functions_arrays;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        int b = 7;
        int n1 = 21;
        int n2 = 202;

        int diff = 0;
        int borrow = 0;
        int p = 0;
        int carry = 0;
        while(n1 > 0 || n2 > 0|| carry > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            if((d2 - d1 - borrow) < 0){
                d2 = d2 + b;
                borrow = 1;
            }else {
                borrow = 0;
            }

            diff += (int)Math.pow(10,p) * (d2 - d1 - carry);
            n1 /= 10;
            n2 /= 10;
            p++;
            carry = borrow;
            
        }
        System.out.println(diff);
    }
}
