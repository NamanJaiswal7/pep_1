package functions_arrays;

public class CeilAndFloor {
    public static int getCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
                ceil = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ceil;
    }

    public static int getFloor(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int mid = left + (right-left)/2;
        while(left <= right){
            mid = left + (right-left)/2;

            if(target > arr[mid]){
                left = mid + 1;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else if(target == arr[mid]) {
                return arr[mid];
            }
        }
        return arr[mid-1];
    }

    public static void main() {
    int ceil = getCeil(new int[]{10,20,30,40,50,60,70,80,90,100},52);
    int floor = getFloor(new int[]{10,20,30,40,50,60,70,80,90,100},52);

        System.out.println(ceil);
        System.out.println(floor);
    }
}
