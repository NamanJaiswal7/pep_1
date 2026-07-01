package getting_started;

public class CountDigit {
    int countDigitOfNumber(int num){
        if(num == 0){
            return 1;
        }

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main() {
        CountDigit cd = new CountDigit();
        System.out.println(cd.countDigitOfNumber(65784383));
    }
}
