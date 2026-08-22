package recursion_backtracking;

public class DisplayAnArray {
    private static void displayArray(int [] arr,int idx){
        if(idx == arr.length){
            return;
        }

        System.out.println(arr[idx]);
        displayArray(arr,idx+1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        displayArray(new int[] {10,20,30,50,22}, 0);
    }
}
