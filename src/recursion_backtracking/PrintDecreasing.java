package recursion_backtracking;

public class PrintDecreasing {
    private static void printDecreasing(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printDecreasing(num - 1);
    }
    public static void main() {
        printDecreasing(10);
    }
}
