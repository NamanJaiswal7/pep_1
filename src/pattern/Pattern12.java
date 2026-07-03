package pattern;

public class Pattern12 {

    private static void printPattern(int n){
        int nst = 1;
        int i = 0;
        int first=0;
        int second = 1;
        while(i<n){
            //print star
            int j = 1;
            while(j <= nst){
                System.out.print(first);
                System.out.print("\t");
                int next = first + second;
                first = second;
                second = next;
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
