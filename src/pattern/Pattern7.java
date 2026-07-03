package pattern;

public class Pattern7 {
    private static void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main() {
        printPattern(5);
    }
}
