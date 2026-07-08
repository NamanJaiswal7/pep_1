package functions_arrays;

public class DifferenceOfArray {
    private static int[] getDifferenceOfArray(int[] a1,int[] a2){
        int[] result = new int[a2.length];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = result.length-1;

        int diff =0;
        while(k >= 0){
            if(i>=0) {
                int lastEle2 = a2[j];
                int lastEle1 = a1[i];
                if (lastEle2 - diff >= lastEle1) {
                    result[k] = a2[j] - diff - a1[i];
                    diff =0;
                } else {
                    result[k] = a2[j] + 10 - diff - a1[i];
                    diff = 1;
                }
            }else{
                if(a2[j]==0&& diff>0){
                    result[k]=a2[j]+10-diff;
                }else{
                    result[k]=a2[j]-diff;
                }


            }


        i--;
        j--;
        k--;

        }

        return result;
    }
   public static void main() {
       int answer[]=getDifferenceOfArray(new int[] {1,0,0,0},new int[]{1,0,0,0});
       // Todo: Remove the first element in printing when it is zero.
       for(int num:answer){
           System.out.println(num);
       }
    }
}
