package pattern;

public class Pattern6 {
    private static void printPattern(int n){
        int nst1 = n/2+1;
        int nst2 =n/2+1;
        int nsp = 1;
        int i = 0;
        while(i<n){
            //print star
            int j = 1;
            while(j <= nst1){
                System.out.print("*");
                j++;
            }
            //print space
            j = 1;
            while(j <= nsp){
                System.out.print(" ");
                j++;
            }
            //print star
             j = 1;
            while(j <= nst2){
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(i<n/2){
                nst1--;
                nsp+=2;
                nst2--;
            }else{
                nst1++;
                nsp-=2;
                nst2++;
            }
            i++;

        }
    }

    public static void main() {
        printPattern(5);
    }
}
