package functions_arrays;

public class SumOfTwoArrays {
//    private static int[] getSum(int[] arr, int[] ints){
//        int maxLength = 0;
//        int[] maximumArray;
//        int[] minArray;
//            if(arr.length>ints.length){
//                maxLength=arr.length;
//                maximumArray=arr;
//                minArray=ints;
//            }else{
//                maxLength=ints.length;
//                maximumArray=ints;
//                minArray= arr;
//            }
//            int[] newMinimumArr= new int[maximumArray.length];
//        int diff = maximumArray.length - minArray.length;
//        int j =0;
//        for(int i = 0; i<newMinimumArr.length;i++){
//
//            if(diff>0){
//                newMinimumArr[i]=0;
//                diff--;
//            }else{
//                newMinimumArr[i] = minArray[j];
//                j++;
//            }
//        }
//        for(int i = 0; i < newMinimumArr.length ; i++){
//            maximumArray[i] =maximumArray[i]+newMinimumArr[i];
//        }
//
//        return maximumArray;
//    }

//    private static int[] getSum(int[] a, int[] b) {
//        int max = Math.max(a.length, b.length);
//        int[] result = new int[max];
//
//        for (int i = 0; i < max; i++) {
//            int x = i >= max - a.length ? a[i - (max - a.length)] : 0;
//            int y = i >= max - b.length ? b[i - (max - b.length)] : 0;
//
//            result[i] = x + y;
//        }
//
//        return result;
//    }

    private static int[] getSum(int[] arr1, int[] arr2) {
        int max = Math.max(arr1.length,arr2.length);
        int[] result = new int[max+1];

        int i = arr1.length-1;
        int j = arr2.length- 1;
        int k = result.length-1;
        int carry = 0;
        while(k > 0){
            int sum =0;
            if(i>=0 && j>=0){
                sum = carry + arr1[i] + arr2[j];
            }else if(i>=0){
                sum = carry +arr1[i];
            }else if(j>=0){
                sum = carry + arr2[j];
            }
            carry = sum / 10;
            result[k] = sum % 10;

            k--;
            i--;
            j--;
        }

        result[0]=carry;
        return result;
    }
    public static void main() {
        int[] arrAfterSum=getSum(new int[]{9,9,9}, new int[]{1});
        int k = 0;
        while(k<arrAfterSum.length){
            if (k == 0 && arrAfterSum[0] == 0) {
                k++;
                continue;
            }
                System.out.println(arrAfterSum[k]);


            k++;
        }
    }
}
