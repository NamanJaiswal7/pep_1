package strings_stringBuilder_ArrayList;

public class ToggleCharaters {
    private static boolean isCapital(char ch){
        if(ch >=65 && ch <=90){
            return true;
        }
        return false;
    }
    private static void toggleCharacters(StringBuilder str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(isCapital(ch)){
                str.setCharAt(i, (char) (ch+32));
            }else{
                str.setCharAt(i, (char) (ch-32));
            }
        }
        System.out.println(str);
    }
    public static void main() {

        toggleCharacters(new StringBuilder("AvBuuMMMVViZ"));
    }
}
