package recursion_backtracking;

import java.util.ArrayList;

public class MazaPathWithJump {
    //sr - starting row
    //sc - starting column
    //dr - destination row
    //dc - destination column
    private static ArrayList<String> getMazaPathWithJump(int sr, int sc, int dr, int dc){
        if(sr > dr || sc > dc){
            return new ArrayList<>();
        }
        if(sr == dr && sc == dc){
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }


        ArrayList<String> paths1 = new ArrayList<>();
        for(int i = sc; i <= dc;i++){
            ArrayList<String> horPath = getMazaPathWithJump(sr,sc+i,dr,dc);
            for(int j = 0; j < horPath.size(); j++){
                paths1.add(horPath.get(j));
            }
        }
        for(int i = sr; i<=dr;i++){
            getMazaPathWithJump(sr+i,sc,dr,dc);
        }
        for(int i = sr,j=sc; i<=dr&&j<=dc;i++,j++){
            getMazaPathWithJump(sr+i,sc+j,dr,dc);
        }
        ArrayList<String> paths2 = getMazaPathWithJump(sr+1,sc,dr,dc);

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

    }
}
