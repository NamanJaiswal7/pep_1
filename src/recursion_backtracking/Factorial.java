package recursion_backtracking;

public class Factorial {
    private static int getFactorial(int num){
        if(num == 1){
            return 1;
        }
        return getFactorial(num - 1) * num;
    }
    public static void main() {
        System.out.println(getFactorial(5));
    }
}
