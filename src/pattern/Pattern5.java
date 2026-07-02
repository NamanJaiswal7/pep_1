package pattern;

public class Pattern5 {
    private static void printPattern(int n){
        int nst = 1;
        int nsp = n/2;
        int i = 0;
        while(i<n){
            //print space
            int j = 1;
            while(j <= nsp){
                System.out.print(" ");
                j++;
            }
            //print star
            j = 1;
            while(j <= nst){
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(i<n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
            i++;

        }
    }

    public static void main() {
        printPattern(5);
    }
}
