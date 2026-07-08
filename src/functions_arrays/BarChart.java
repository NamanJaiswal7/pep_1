package functions_arrays;

public class BarChart {
    private static int getMaxEleInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void printBarChart(int[] arr) {
        int maximumEle = getMaxEleInArray(arr);
        int[] spaceArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            spaceArray[i] = maximumEle - arr[i];
            System.out.println(spaceArray[i]);
        }


        for (int i = 0; i < maximumEle; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(spaceArray[j]>0){
                    System.out.print(" ");
                    spaceArray[j]--;
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }


    public static void main() {
        printBarChart(new int[]{3,1,0,7,5});
    }
}
