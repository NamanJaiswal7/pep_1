package pattern;

public class Pattern4 {
    private static void printPattern(int n){
        int nst = n;
        int nsp = 0;
        int i = 0;
        while(i<n){
            //print space
            int j = 1;
            while(j <= nsp){
                System.out.print(" ");
                j++;
            }
            //print start
            j = 1;
            while(j <= nst){
                System.out.print("*");
                j++;
            }
            System.out.println();
            nst--;
            nsp++;
            i++;
        }
    }

    public static void main() {
        printPattern(5);
    }
}
