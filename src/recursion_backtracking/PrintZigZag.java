package recursion_backtracking;

public class PrintZigZag {
    private static void printZigZag(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printZigZag(num - 1);
        System.out.println(num);
        printZigZag(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        printZigZag(3);
    }
}
