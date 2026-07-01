package getting_started;

public class Fibonacci {

    void printFibonacciSeries(int num){
        if(num <= 0){
            return;
        }
        int first = 0;
        int second = 1;

        for(int i = 0; i < num; i++){
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main() {
        Fibonacci fib = new Fibonacci();
        fib.printFibonacciSeries(1);
    }
}
