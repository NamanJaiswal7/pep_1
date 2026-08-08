package recursion_backtracking;

public class PowerLiner {
    private static int getPowerLiner(int num, int pow){
        if(pow == 0){
            return 1;
        }
       return getPowerLiner(num,pow-1) * num;
    }
    public static void main() {
        System.out.println(getPowerLiner(10,3));
    }
}
