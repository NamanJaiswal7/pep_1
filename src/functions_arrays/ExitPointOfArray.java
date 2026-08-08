package functions_arrays;

public class ExitPointOfArray {
    private static void getExitPointOfArray(int arr[][]){
        int i = 0;
        int j = 0;

        int cas = 1;
        int counter = 1;
        while((i >= 0 && j >= 0 ) ||(i <= arr.length - 1 && j <= arr[0].length - 1)){

            if(arr[i][j] == 0 && cas == 1){
                if(j==arr[0].length-1){
                    System.out.println(i+" "+j);
                    return;
                }
                j++;
            }else if(arr[i][j]==0 && cas == 2){
                if(i==arr.length){
                    System.out.println(i+" "+j);
                    return;
                }
                i++;
            }else if(arr[i][j]==0 && cas == 3){
                if(j==0){
                    System.out.println(i+" "+j);
                    return;
                }
                j--;
            }else if(arr[i][j]==0 && cas ==4){
                if(i==0){
                    System.out.println(i+" "+j);
                    return;
                }
                i--;
            }else if(arr[i][j] == 1 && counter == 1){
                cas = 2;
                i++;
                counter++;
            }else if(arr[i][j] == 1 && counter == 2){
                j--;
                cas = 3;
                counter++;
            }else if(arr[i][j] == 1 && counter == 3){
                cas = 4;
                i--;
                counter++;
            }else if(arr[i][j] == 1 && counter == 4){
                cas = 1;
                j++;
                counter = 1;
            }

        }
        System.out.println(i+" "+ j);
    }
   public static void main() {
       getExitPointOfArray(new int[][]{{0,0,1,0},{1,0,0,1},{0,0,0,1},{1,0,1,0}});
    }
}
