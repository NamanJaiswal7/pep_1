package recursion_backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GetIndex {
    private static int getFirstIndex(int[] arr, int idx, int data) {

        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == data){
            return idx;
        }
        return getFirstIndex(arr, idx + 1, data);
    }
    private static int getLastIndex(int[] arr, int idx, int data) {

        if(idx == arr.length){
            return -1;
        }

        int index = getLastIndex(arr, idx + 1, data);

        if(index == -1 && arr[idx]==data){
            return idx;
        }else{
            return index;
        }
    }
    private static ArrayList<Integer> getAllIndex(int[] arr, int idx, int data){
        if(idx == arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> getAllIndex = new ArrayList<>();
        if(arr[idx] == data){
            getAllIndex.add(idx);
        }
       ArrayList<Integer> moreIndexes = getAllIndex(arr, idx + 1, data);
        getAllIndex.addAll(moreIndexes);
        return getAllIndex;

    }

    public static void main(String[] args) {
        System.out.println(getFirstIndex(new int[] {1,2,3,4,3}, 0, 3));
        System.out.println(getLastIndex(new int[] {1,2,3,4,3}, 0, 3));
        ArrayList<Integer> indexes = getAllIndex(new int[] {1,2,3,4,3}, 0, 3);
        System.out.println(Arrays.toString(indexes.toArray()));
    }
}
