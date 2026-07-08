package functions_arrays;

public class BinarySearch {
    public static int getIdxUsingBinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = (left+right)/2;
            if(target>arr[mid]){
              left = mid+1;
            }else if(target<arr[mid]){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
   public static void main() {
     int idx = getIdxUsingBinarySearch(new int[]{10,20,30,40,50,60,70,80,90,100},20);
       System.out.println(idx);
    }
}
