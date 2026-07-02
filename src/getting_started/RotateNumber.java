package getting_started;

public class RotateNumber {
    private int countDigitOfNumber(int num){
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

    private int getRotatedNumber(int num, int rotate){
        int countDigit = countDigitOfNumber(num);

        if(rotate < 0){
            rotate = countDigit + rotate;
        }

        if(rotate > countDigit){
            rotate = countDigit % rotate;
        }

        int rotatedNum = 0;
        int count = 0;
        int rotateCopy = rotate;
        while(rotate != 0){
            int lastDigit = num % 10;
            rotatedNum += lastDigit * Math.pow(10,count);
            count++;
            rotate--;

            num = num/10;
        }
        return (int) (rotatedNum * Math.pow(10,countDigit-rotateCopy) + num);
    }

    public static void main() {
        RotateNumber rn = new RotateNumber();
        System.out.println(rn.getRotatedNumber(273910, 1));
    }
}
