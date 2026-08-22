package recursion_backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class GetSubsequence {
    private static ArrayList<String> getSubsequence(String str){
        if(str.length() == 0){
            ArrayList<String> firstString = new ArrayList<>();
            firstString.add("");
            return firstString;
        }

        ArrayList<String> ans = getSubsequence(str.substring(1));
        int len = ans.size();
        for(int i = 0; i < len; i++){
            char ch = str.charAt(0);
            String subStr = ch + ans.get(i);
            ans.add(subStr);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getSubsequence("abc"));

    }
}
