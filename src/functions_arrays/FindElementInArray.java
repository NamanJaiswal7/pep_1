package functions_arrays;

public class FindElementInArray {
    private static int getIndexInArray(int [] arr,int num){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main() {
        System.out.println(getIndexInArray(new int[]{15, 30, 40, 4, 11, 9},40));
    }
}
