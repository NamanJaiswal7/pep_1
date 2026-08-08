package functions_arrays;

public class DiagonalTraversal {
    private static void getDiagonalTraversal(int [][] arr){
        for(int i = 0;i < arr.length; i++){
            int temp = i;
            for(int j = 0 ; j<arr[i].length&&temp<arr.length;j++){
                System.out.print(arr[j][temp]+" ");
                temp++;
            }
            System.out.println();

        }
    }
    public static void main() {
        getDiagonalTraversal(new int[][]{{0,1,2,3,4,5},{10,11,12,13,14,15},{20,21,22,23,24,25},{30,31,32,33,34,35},{40,41,42,43,44,45},{50,51,52,53,54,55}});
    }
}
