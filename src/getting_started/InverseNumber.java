package getting_started;

public class InverseNumber {

    private int getInverseOfNumber(int num, int count){
        if(num == 0){
            return 0;
        }
        return (int) (count * Math.pow(10,(num%10)-1) + getInverseOfNumber(num /10, count+1));
    }

    public static void main() {
        InverseNumber in = new InverseNumber();
        System.out.println(in.getInverseOfNumber(426135,1));
    }
}
