package functions_arrays;

public class SearchInSortedArray {
    private static void searchInSorted2DArray(int[][] arr, int target){
        int colIdx = arr[0].length-1;
        int rowIdx = 0;

        while(colIdx < arr[0].length && colIdx >= 0 && rowIdx >= 0 && rowIdx < arr.length ){
            if(target > arr[rowIdx][colIdx]){
                rowIdx++;
            }else if(target < arr[rowIdx][colIdx]){
                colIdx--;
            }else if(target == arr[rowIdx][colIdx]){
                System.out.println(rowIdx+" "+colIdx);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        searchInSorted2DArray(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 9);
    }
}
