package recursion_backtracking;

import java.util.ArrayList;

public class GetKeyBoardCombination {
    static String[] codes = {".,","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    private static ArrayList<String> getCombination(String str){
        if(str.length() == 0){
            ArrayList<String> strList = new ArrayList<>();
            strList.add("");
            return strList;
        }

      ArrayList<String> combinations =  getCombination(str.substring(1));
        int len = combinations.size();
        ArrayList<String> results = new ArrayList<>();
        for(int i = 0; i < len; i++){
            char ch = str.charAt(0);
            int index = Character.getNumericValue(ch);
            String chars = codes[index];

            for(int j = 0; j < chars.length(); j++){
                results.add(chars.charAt(j)+combinations.get(i));
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(getCombination("578"));
    }
}
