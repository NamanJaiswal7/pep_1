package getting_started;

public class PrintDigit {

    private int countDigits(int num){
        num = Math.abs(num);

        return (int)Math.floor(Math.log10(num)) + 1;
    }
    private int makeNewNumber(int num, int count){
        int newDigit = 0;
        while(num != 0){
            int lastDigit = num % 10;
            newDigit += (int) Math.pow(10,count-1) * lastDigit;
            count--;
            num = num/10;
        }
        return newDigit;
    }
    private void printDigit(int num){
        while(num!=0){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }

    public static void main() {
        PrintDigit pd = new PrintDigit();
        int digitcount = pd.countDigits(65784383);
        int newNumber = pd.makeNewNumber(65784383,digitcount);
        pd.printDigit(newNumber);
    }
}
