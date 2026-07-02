package getting_started;

import javax.crypto.spec.PSource;

public class PythagoreanTriplets {
    private boolean checkPythagorean(int first, int second, int third){
        int max = first;
        int num1 = second;
        int num2 = third;
        if(first > second && first > third){
            max = first;
        }else if(second > first && second > third){
            max = second;
            num1 = first;
            num2 = third;
        }else if(third > first && third > second){
            max = third;
            num1 = second;
            num2 = first;
        }else{
            return false;
        }
        if(max*max == num1*num1 + num2*num2){
            return true;
        }else{
            return false;
        }

    }
    public static void main() {
        PythagoreanTriplets pt = new PythagoreanTriplets();
        System.out.println(pt.checkPythagorean(5,3,4));
    }
}
