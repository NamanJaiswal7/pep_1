package recursion_backtracking;

public class TowerOfHanoi {
    private static void towerOfHanoi(int num,int first,int second,int third){
        if(num==0){
            return;
        }


        towerOfHanoi(num-1,first,third,second);
        System.out.println(num+"->"+ first+" to "+second);
        towerOfHanoi(num-1,third,second,first);

    }
    public static void main(String[] args) {
        towerOfHanoi(3,10,11,12);
    }
}
