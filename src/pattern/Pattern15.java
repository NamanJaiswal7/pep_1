package pattern;

public class Pattern15 {

    private static void printPattern(int n){

        int nsp = n/2;
        int nst = 1;
        int i = 0;

        while(i<n){
            int j = 0;
            while(j<nsp){
                System.out.print(" ");
                j++;
            }

            j=0;
            while(j<nst){
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(i<n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            i++;
        }
    }
    public static void main() {
        printPattern(5);
    }
}
