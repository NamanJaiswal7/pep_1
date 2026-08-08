package functions_arrays;

import java.util.Arrays;

public class ShellRotate {
    private static void fillArr(int [][] arr, int [] shellArr,int shellNumber){

        //Top to Down
        int shellIdx = 0;
        int topColumn = shellNumber - 1;
        for(int i = shellNumber - 1,j = 0; i <= arr.length - shellNumber; i++){
            arr[i][topColumn]= shellArr[shellIdx];
            shellIdx++;
        }

        // Left to Right
        int bottomRow =  arr.length - shellNumber;
        for(int i = shellNumber; i <= arr[0].length - shellNumber; i++){
            arr[bottomRow][i] =  shellArr[shellIdx] ;
            shellIdx++;
        }

        //Down to Up
        int leftRow =  arr[0].length - shellNumber;
        for(int i = arr.length - shellNumber - 1; i >= shellNumber - 1; i--){
            arr[i][leftRow]= shellArr[shellIdx];
            shellIdx++;
        }

        // Left to Right
        int leftColum =  shellNumber - 1;
        for(int i = arr[0].length - shellNumber - 1; i >= shellNumber ; i--){
            arr[leftColum][i]= shellArr[shellIdx];
            shellIdx++;
        }

    }
    private static void swap(int [] arr, int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    private static void RotateArray(int [] arr, int target){
        int rotation = ((arr.length - target) % arr.length);
        System.out.println(rotation);
        int rotationIdx = rotation;
        int lastIdx = arr.length-1;
        swap(arr,rotationIdx,lastIdx);
        swap(arr,0,rotation-1);
        swap(arr,0,arr.length-1);

    }
    private static void shellRotate(int [][] arr,int shellNumber, int rotation){
        int rowCount = 2 * ((arr[0].length - shellNumber) - (0 + shellNumber - 1));
        int columnCount = 2 * ((arr.length - shellNumber) - ( 0 + shellNumber - 1));

        int [] shellArr = new int[columnCount+rowCount];

        //Top to Down
        int shellIdx = 0;
        int topColumn = shellNumber - 1;
        for(int i = shellNumber - 1,j = 0; i <= arr.length - shellNumber; i++){
            shellArr[shellIdx] = arr[i][topColumn];
            shellIdx++;
        }

        // Left to Right
        int bottomRow =  arr.length - shellNumber;
        for(int i = shellNumber; i <= arr[0].length - shellNumber; i++){
            shellArr[shellIdx] = arr[bottomRow][i];
            shellIdx++;
        }

        //Down to Up
        int leftRow =  arr[0].length - shellNumber;
        for(int i = arr.length - shellNumber - 1; i >= shellNumber - 1; i--){
            shellArr[shellIdx] = arr[i][leftRow];
            shellIdx++;
        }

        // Left to Right
        int leftColum =  shellNumber - 1;
        for(int i = arr[0].length - shellNumber - 1; i >= shellNumber ; i--){
            shellArr[shellIdx] = arr[leftColum][i];
            shellIdx++;
        }

        RotateArray(shellArr,rotation);
        fillArr(arr,shellArr,shellNumber);

        Print2DArray.print2DArray(arr);
    }
   public static void main() {
       shellRotate(new int [][]{{11,12,13,14,15,16},{21,22,23,24,25,26},{31,32,33,34,35,36},{41,42,43,44,45,46},{51,52,53,54,55,56},{61,62,63,64,65,66}},2,1);
    }
}
