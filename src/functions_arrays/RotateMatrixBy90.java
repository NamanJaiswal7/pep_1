package functions_arrays;

public class RotateMatrixBy90 {
    private static void swapNumber(int [][] arr, int initialI, int initialJ, int targetI, int targetJ){
        int temp = arr[initialI][initialJ];
        arr[initialI][initialJ] = arr[targetI][targetJ];
        arr[targetI][targetJ] = temp;
    }
    private static void getRotatedMatrix(int [][] arr){
        for(int i = 0,l=arr.length-1; i <arr.length&&l>=0;i++){
            for(int j = 0,k=arr.length-1;j<arr.length&&k>=0;j++){
                if(i+j<=arr.length-1){
                    swapNumber(arr,i,j,k,l);
                    k--;
                }
            }
            l--;
        }

        for(int i = arr.length-1,k=0;i>=0||k<arr.length;i--,k++){
            for(int j =0;j<arr.length;j++){
                if(i>k){
                    swapNumber(arr,i,j,k,j);

                }

            }
        }

    Print2DArray.print2DArray(arr);
    }
    //Solution 2 - Transponse of Matrix and then reverse
    public static void main() {
        getRotatedMatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
}
