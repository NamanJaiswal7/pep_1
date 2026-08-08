package recursion_backtracking;

public class PrintIncreasingDecreasing {
    private static void printIncreasingDecreasing(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printIncreasingDecreasing(num - 1);
        System.out.println(num);
    }
    public static void main() {
        printIncreasingDecreasing(10);
    }
}
