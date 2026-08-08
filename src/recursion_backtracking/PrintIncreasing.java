package recursion_backtracking;

public class PrintIncreasing {
    private static void printIncreasing(int num){
        if(num == 0){
            return;
        }

        printIncreasing(num - 1);
        System.out.println(num);
    }

    public static void main() {
        printIncreasing(10);
    }
}
