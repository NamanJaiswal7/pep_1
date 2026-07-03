package pattern;

public class Pattern13 {

    private static void printPattern(int n){
        int nst = 1;
        int i = 0;
        int second = 0;
        while(i<n){
            int first=1;

            //print star
            int j = 1;
            while(j <= nst){
                int next = first + second;
                System.out.print(first);

                System.out.print("\t");
                j++;
            }
            System.out.println();
            nst++;
            i++;

        }
    }
    public static void main() {
        printPattern(6);
    }
}
