package strings_stringBuilder_ArrayList;

public class PrintAllPalindromicSubStrings {
    private static boolean isPalindromic(String str){
        int first = 0;
        int last = str.length()-1;
        while(first < last){
            char c1 = str.charAt(first);
            char c2 = str.charAt(last);
            if(c1 != c2){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    private static void printPalindromicSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j = i;j<str.length();j++ ){
                String subStr = str.substring(i,j+1);
                    if(isPalindromic(subStr)){
                        System.out.println(subStr);
                    }
            }
        }
    }
    public static void main(String[] args) {
        printPalindromicSubStrings("abcba");
    }
}
