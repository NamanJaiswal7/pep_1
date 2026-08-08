package strings_stringBuilder_ArrayList;

public class PermutationOfString {
    private static int factorial(int n){
        int value = 1;
        for(int i = 1; i <= n; i++){
            value *= i;
        }
        return value;
    }
    private static void getPermutationOfString(StringBuilder str){
        int len = factorial(str.length());

        for(int i = 0; i < len; i++){
            int temp = i;
            StringBuilder sb = new StringBuilder();
            StringBuilder tempStr = new StringBuilder(str);
            for(int j = str.length(); j >= 1; j--){
                int reminder = temp % j;
                int quetioent = temp / j;

                char ch = tempStr.charAt(reminder);
                tempStr.deleteCharAt(reminder);
                sb.append(ch);
                temp = quetioent;
            }
            System.out.println(sb);
        }
    }
    public static void main() {
        getPermutationOfString(new StringBuilder("abc"));
    }
}
