package functions_arrays;

import java.util.Arrays;

public class SaddlePoint {

    static int lowestIdx = -1;
    static int highestIdx = -1;
    private static int getLowest(int[] arr){
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<lowest){
                lowest = arr[i];
                lowestIdx = i;
            }
        }
        return lowest;
    }
    private static int getMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                highestIdx = i;
            }
        }
        return max;
    }
    private static void getIdxOfSaddlePoint(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int lowest = getLowest(arr[i]);
            int[] tempArr = new int[arr[i].length];
            for(int j = 0; j < arr.length; j++){
                tempArr[j] = arr[j][lowestIdx];
            }


            int highest = getMaximum(tempArr);
            System.out.println(Arrays.toString(arr[i]));
            if(lowest == highest){
                System.out.println("Saddle Point is at " + i + " " + lowestIdx);
                return;
            }
        }
    }
    public static void main(String[] args) {
        getIdxOfSaddlePoint(new int[][]{{1,2,3,4,5},{2,1,5,3,4},{3,5,1,4,2}});
    }
}
