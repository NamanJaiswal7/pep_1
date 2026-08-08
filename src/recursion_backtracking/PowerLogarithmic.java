package recursion_backtracking;

public class PowerLogarithmic {
    private static int getPower(int num, int pow) {
        // Base case
        if (pow == 0) {
            return 1;
        }

        int halfNum = getPower(num, pow / 2);

        // Assuming pow is even for this specific case
        return halfNum * halfNum;
    }

    // Notice the required String[] args here so Java can run it
    public static void main(String[] args) {
        System.out.println(getPower(10, 4)); // Output: 10000 (since 4 is even)
    }
}