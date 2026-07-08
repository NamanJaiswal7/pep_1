package functions_arrays;

public class SubsetOfArray {
    public static void printArray(int[] arr){
        for(int i = 0; i < (int)Math.pow(2,arr.length);i++){
            int[] tempArr = new int[arr.length];
            int k = tempArr.length - 1;
            int tempNum = i;

            while(tempNum>0){
                int reminder = tempNum % 2;
                tempNum = tempNum/2;
                tempArr[k] = reminder;
                k--;
            }

            for(int j = 0;j <tempArr.length;j++){
                if(tempArr[j]==1){
                    System.out.print(arr[j]);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    public static void main() {
        printArray(new int[]{1,2,3});
    }
}
