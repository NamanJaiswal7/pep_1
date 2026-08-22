package recursion_backtracking;

import java.util.ArrayList;

public class GetStairPaths {
    private static ArrayList<String> getStairPath(int num){
        if(num == 0){
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;

        }
        if(num < 0){
            return new ArrayList<String>();
        }
        ArrayList<String> paths1 = getStairPath(num - 1);
        ArrayList<String> paths2 = getStairPath(num - 2);
        ArrayList<String> paths3 = getStairPath(num - 3);

        ArrayList<String> allPaths = new ArrayList<>();
        for(int i = 0; i < paths1.size(); i++){
            allPaths.add("1"+paths1.get(i));
        }
        for(int i = 0; i < paths2.size(); i++){
            allPaths.add("2"+paths2.get(i));
        }
        for(int i = 0; i < paths3.size(); i++){
            allPaths.add("3"+paths3.get(i));
        }
        return allPaths;
        
    }
    public static void main(String[] args) {
        System.out.println(getStairPath(3));
    }
}
