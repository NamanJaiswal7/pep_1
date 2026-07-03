package pattern;

public class Pattern10 {
    private static void printPattern(int n){
        int nst1= 1;
        int nsp1 = n/2;
        int nst2= 1;
        int nsp2 = 0;
        int i = 0;
        while(i<n){
            int j = 1;
            while(j <= nsp1){
                System.out.print("\t");
                j++;
            }
            //print star
             j = 1;
            while(j <= nst1){
                System.out.print("* ");
                j++;
            }
            //print space
            j = 1;
            while(j <= nsp2){
                System.out.print("\t");
                j++;
            }

            //print star
            j = 1;
            while(j <= nst2){
                if(i!=0&&i!=n-1)
                System.out.print("* ");
                j++;
            }

            System.out.println();
            if(i<n/2){
            nsp1--;
            nsp2+=2;
            }else{
                nsp1++;
                nsp2-=2;
            }
            i++;

        }
    }

    public static void main() {
        printPattern(5);
    }
}
