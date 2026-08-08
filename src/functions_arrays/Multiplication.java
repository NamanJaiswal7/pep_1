package functions_arrays;

public class Multiplication {
//    2*2      2*1
//    [1, 2]  [2, 4] [8]
//    [4, 5]  [3, 5] [23]
    private static void getMatrixMultiplication(int [][] arr1,int [][] arr2){
        if(arr1[0].length != arr2.length){
            System.out.println("Not Valid Matrix for multiplication.");
            return;
        }
        int [][] multipliedMatrix = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++){
            int tempVal = 0;
            int k = 0;

            for(int j = 0; j < arr1[i].length;j++){
                int multipliedValue = arr1[i][j] * arr2[j][k];
                tempVal += multipliedValue;
            }
            multipliedMatrix[i][k] = tempVal;
        }
        Print2DArray pt = new Print2DArray();
        pt.print2DArray(multipliedMatrix);
    }
    public static void main() {
        getMatrixMultiplication(new int[][]{{1,2},{4,5}},new int[][]{{2},{3}});
    }
}
