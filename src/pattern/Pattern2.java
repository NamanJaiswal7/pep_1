package pattern;

public class Pattern2 {
    private static void printPattern(int n){
        int nst = 5;
        int i = 0;
        while(i<n){
            //print star
            int j = 1;
            while(j <= nst){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            nst--;
            i++;
        }
    }

    public static void main() {
        printPattern(5);
    }
}
