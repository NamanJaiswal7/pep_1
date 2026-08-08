package functions_arrays;

public class Print2DArray {
    public static void print2DArray(int [][] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main() {
        print2DArray(new int[][]{{11,12,13,14},{21,22,23,24},{31,32,33,34}});
    }
}
