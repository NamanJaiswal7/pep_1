package getting_started;

import java.util.*;

public class Prime{
    public static boolean checkPrime(int num){
        for(int i = 2; i*i <= num ;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int low, int high){
        for(int i = low;i <= high; i++){
            boolean isPrime = checkPrime(i);
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int low = 1;
        int high = 3;
        printPrime(low,high);
    }
}
