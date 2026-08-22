package recursion_backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazaPath {
    //sr - starting row
    //sc - starting column
    //dr - destination row
    //dc - destination column
    private static ArrayList<String> getMazaPath(int sr, int sc, int dr, int dc){
        if(sr > dr || sc > dc){
            return new ArrayList<>();
        }
        if(sr == dr && sc == dc){
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }


       ArrayList<String> paths1 = getMazaPath(sr,sc+1,dr,dc);
       ArrayList<String> paths2 = getMazaPath(sr+1,sc,dr,dc);

       ArrayList<String> allPaths = new ArrayList<>();
       for(int i = 0; i < paths1.size(); i++){
           allPaths.add("h"+paths1.get(i));
       }
        for(int i = 0; i < paths2.size(); i++){
            allPaths.add("v"+paths2.get(i));
        }
        return allPaths;
    }
    public static void main(String[] args) {
        System.out.println(getMazaPath(1,1,2,2));
    }
}
