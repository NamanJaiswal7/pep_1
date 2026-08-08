package functions_arrays;

public class WaveTraversal {
//    [11,12,13,14]
//    [15,16,17,18]
//    [19,20,21,22]
    private static void getWaveTraversal(int[][] arr){
        int k = 0;
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length ; j++){
                if(i % 2 == 0){
                    System.out.println(arr[j][i]);
                    k = j;
                }else{
                    System.out.println(arr[k][i]);
                    k--;
                }
            }
        }

    }
   public static void main() {
       getWaveTraversal(new int[][]{{11,12,13,14},{15,16,17,18},{19,20,21,22}});
    }
}
