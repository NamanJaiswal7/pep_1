package strings_stringBuilder_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePrime {
    public static boolean checkPrime(int num){
        for(int i = 2; i*i <= num ;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    private static void removePrimesFromAL(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size();){
            if(checkPrime(arr.get(i))){
                arr.remove(i);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
    public static void main() {
        removePrimesFromAL(new ArrayList<Integer>(List.of(8,9,12,17)));
    }
}
