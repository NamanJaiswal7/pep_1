package functions_arrays;

public class FirstAndLastIndex {
    static int firstIdx;
    static int lastIdx;

    private static void getFirstAndLastIdx(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left - (left - right)/2;
            if(target > arr[mid]){
                left = mid + 1;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else{
                firstIdx = mid;
                lastIdx = mid;
                while(firstIdx!=0 && arr[firstIdx] == arr[mid]){
                    firstIdx--;
                }
                while(lastIdx != arr.length - 1 && arr[lastIdx] == arr[mid]){
                    lastIdx++;
                }
                return;
            }
        }
    }

    public static void main() {
        getFirstAndLastIdx(new int[]{10,20,20,20,50,60,60,60,70,70},60);
        System.out.println(firstIdx + 1);
        System.out.println(lastIdx - 1);
    }
}
