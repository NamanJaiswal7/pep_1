package functions_arrays;

public class SpanOfArray {

    private static int getSpanOfArray(int [] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];

            }
        }
        return max-min;
    }

    public static void main() {
        System.out.println(getSpanOfArray(new int[]{15, 30, 40, 4, 11, 9}));
    }
}
