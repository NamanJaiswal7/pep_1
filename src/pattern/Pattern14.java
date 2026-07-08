package pattern;

public class Pattern14 {

    private static void printPattern(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }
    public static void main() {
        printPattern(6);
    }
}
