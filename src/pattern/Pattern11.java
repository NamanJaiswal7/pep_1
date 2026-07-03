package pattern;

public class Pattern11 {
    private static void printPattern(int n){
        int nst = 1;
        int i = 0;
        int counter=1;
        while(i<n){
            //print star
            int j = 1;
            while(j <= nst){
                System.out.print(counter);
                System.out.print("\t");
                counter++;
                j++;
            }
            System.out.println();
            nst++;
            i++;

        }
    }
    public static void main() {
        printPattern(5);
    }
}
