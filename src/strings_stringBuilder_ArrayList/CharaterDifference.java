package strings_stringBuilder_ArrayList;

public class CharaterDifference {
    private static void characterDifference(StringBuilder str){
        int initial = 0;
        int second = 1;

        StringBuilder newStr = new StringBuilder();
        while(initial < str.length() && second < str.length()){
            char ch1 = str.charAt(initial);
            char ch2 = str.charAt(second);

            int difference = ch2 - ch1;
            newStr.append(ch1);
            newStr.append(difference);
            initial++;
            second++;
        }
        if (str.length() > 0) {
            newStr.append(str.charAt(str.length() - 1));
        }
        System.out.println(newStr);
    }

   public static void main() {
       characterDifference(new StringBuilder("aBcferSp"));
    }
}
