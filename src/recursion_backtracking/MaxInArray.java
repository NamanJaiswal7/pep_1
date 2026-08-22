package recursion_backtracking;

public class MaxInArray {
    private static int getMaxFromArr(int arr[], int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }

        int potentialMax = getMaxFromArr(arr, idx+1);
        return Math.max(potentialMax, arr[idx]);
    }
    public static void main(String[] args) {
        System.out.println(getMaxFromArr(new int[] {1,2,3,4,5}, 0));
    }
}
