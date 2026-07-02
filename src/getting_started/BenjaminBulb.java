package getting_started;

public class BenjaminBulb {
    private void checkPerfectNumber(int num){
        for(int i = 1; i*i <= num ;i++){

                System.out.println(i*i);
        }
        }

    public static void main() {
        BenjaminBulb bb = new BenjaminBulb();
        bb.checkPerfectNumber(16);
    }
}
