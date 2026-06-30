package functions_arrays;

public class anyBaseAddition {
    public static void main(String[] args) {
        int b = 8;
        int n1 = 777;
        int n2 = 1;

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
        System.out.println(sum);
    }
}